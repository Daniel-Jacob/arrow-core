package arrow.core.extensions.ior.functor

import arrow.Kind
import arrow.core.ForIor
import arrow.core.Ior
import arrow.core.Ior.Companion
import arrow.core.Tuple2
import arrow.core.extensions.IorFunctor

/**
 * cached extension
 */
@PublishedApi()
internal val functor_singleton: IorFunctor<Any?> = object : IorFunctor<Any?> {}

@JvmName("map")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "this.map(arg1)"
  ),
  DeprecationLevel.WARNING
)
fun <L, A, B> Kind<Kind<ForIor, L>, A>.map(arg1: Function1<A, B>): Ior<L, B> =
    arrow.core.Ior.functor<L>().run {
  this@map.map<A, B>(arg1) as arrow.core.Ior<L, B>
}

@JvmName("imap")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "this.map(arg1)"
  ),
  DeprecationLevel.WARNING
)
fun <L, A, B> Kind<Kind<ForIor, L>, A>.imap(arg1: Function1<A, B>, arg2: Function1<B, A>): Ior<L, B> =
  arrow.core.Ior.functor<L>().run {
    this@imap.imap<A, B>(arg1, arg2) as arrow.core.Ior<L, B>
  }

@JvmName("lift")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "Ior.lift(arg0)",
  "arrow.core.Ior"
  ),
  DeprecationLevel.WARNING
)
fun <L, A, B> lift(arg0: Function1<A, B>): Function1<Kind<Kind<ForIor, L>, A>, Kind<Kind<ForIor, L>,
    B>> = arrow.core.Ior
   .functor<L>()
   .lift<A, B>(arg0) as kotlin.Function1<arrow.Kind<arrow.Kind<arrow.core.ForIor, L>, A>,
    arrow.Kind<arrow.Kind<arrow.core.ForIor, L>, B>>

@JvmName("void")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "this.void()"
  ),
  DeprecationLevel.WARNING
)
fun <L, A> Kind<Kind<ForIor, L>, A>.void(): Ior<L, Unit> = arrow.core.Ior.functor<L>().run {
  this@void.void<A>() as arrow.core.Ior<L, kotlin.Unit>
}

@JvmName("fproduct")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "this.fproduct(arg1)"
  ),
  DeprecationLevel.WARNING
)
fun <L, A, B> Kind<Kind<ForIor, L>, A>.fproduct(arg1: Function1<A, B>): Ior<L, Tuple2<A, B>> =
    arrow.core.Ior.functor<L>().run {
  this@fproduct.fproduct<A, B>(arg1) as arrow.core.Ior<L, arrow.core.Tuple2<A, B>>
}

@JvmName("mapConst")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "this.mapConst(arg1)"
  ),
  DeprecationLevel.WARNING
)
fun <L, A, B> Kind<Kind<ForIor, L>, A>.mapConst(arg1: B): Ior<L, B> =
    arrow.core.Ior.functor<L>().run {
  this@mapConst.mapConst<A, B>(arg1) as arrow.core.Ior<L, B>
}

@JvmName("mapConst")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "arg1.mapConst(this)"
  ),
  DeprecationLevel.WARNING
)
fun <L, A, B> A.mapConst(arg1: Kind<Kind<ForIor, L>, B>): Ior<L, A> =
    arrow.core.Ior.functor<L>().run {
  this@mapConst.mapConst<A, B>(arg1) as arrow.core.Ior<L, A>
}

@JvmName("tupleLeft")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "this.tupleLeft(arg1)"
  ),
  DeprecationLevel.WARNING
)
fun <L, A, B> Kind<Kind<ForIor, L>, A>.tupleLeft(arg1: B): Ior<L, Tuple2<B, A>> =
    arrow.core.Ior.functor<L>().run {
  this@tupleLeft.tupleLeft<A, B>(arg1) as arrow.core.Ior<L, arrow.core.Tuple2<B, A>>
}

@JvmName("tupleRight")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
  "this.tupleRight(arg1)"
  ),
  DeprecationLevel.WARNING
)
fun <L, A, B> Kind<Kind<ForIor, L>, A>.tupleRight(arg1: B): Ior<L, Tuple2<A, B>> =
    arrow.core.Ior.functor<L>().run {
  this@tupleRight.tupleRight<A, B>(arg1) as arrow.core.Ior<L, arrow.core.Tuple2<A, B>>
}

@JvmName("widen")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "this.widen<L, B, A>()",
    "arrow.core.widen"
  ),
  DeprecationLevel.WARNING
)
fun <L, B, A : B> Kind<Kind<ForIor, L>, A>.widen(): Ior<L, B> = arrow.core.Ior.functor<L>().run {
  this@widen.widen<B, A>() as arrow.core.Ior<L, B>
}

@Suppress(
  "UNCHECKED_CAST",
  "NOTHING_TO_INLINE"
)
@Deprecated(
  "Functor typeclass is deprecated. Use concrete methods on Ior",
  level = DeprecationLevel.WARNING
)
inline fun <L> Companion.functor(): IorFunctor<L> = functor_singleton as
    arrow.core.extensions.IorFunctor<L>
