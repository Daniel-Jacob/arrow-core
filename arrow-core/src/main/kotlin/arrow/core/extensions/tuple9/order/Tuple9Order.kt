package arrow.core.extensions.tuple9.order

import arrow.core.Tuple2
import arrow.core.Tuple9
import arrow.core.Tuple9.Companion
import arrow.core.extensions.Tuple9Order
import arrow.typeclasses.Order
import arrow.typeclasses.OrderDeprecation
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Int
import kotlin.Suppress
import kotlin.jvm.JvmName

@JvmName("compareTo")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  OrderDeprecation,
  ReplaceWith("this.compareTo(arg1)", "arrow.core.compareTo")
)
fun <A, B, C, D, E, F, G, H, I> Tuple9<A, B, C, D, E, F, G, H, I>.compareTo(
  OA: Order<A>,
  OB: Order<B>,
  OC: Order<C>,
  OD: Order<D>,
  OE: Order<E>,
  OF: Order<F>,
  OG: Order<G>,
  OH: Order<H>,
  OI: Order<I>,
  arg1: Tuple9<A, B, C, D, E, F, G, H, I>
): Int = arrow.core.Tuple9.order<A, B, C, D, E, F, G, H,
    I>(OA, OB, OC, OD, OE, OF, OG, OH, OI).run {
  this@compareTo.compareTo(arg1) as kotlin.Int
}

@JvmName("eqv")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  OrderDeprecation,
  ReplaceWith("this == arg1")
)
fun <A, B, C, D, E, F, G, H, I> Tuple9<A, B, C, D, E, F, G, H, I>.eqv(
  OA: Order<A>,
  OB: Order<B>,
  OC: Order<C>,
  OD: Order<D>,
  OE: Order<E>,
  OF: Order<F>,
  OG: Order<G>,
  OH: Order<H>,
  OI: Order<I>,
  arg1: Tuple9<A, B, C, D, E, F, G, H, I>
): Boolean = arrow.core.Tuple9.order<A, B, C, D, E, F, G, H,
    I>(OA, OB, OC, OD, OE, OF, OG, OH, OI).run {
  this@eqv.eqv(arg1) as kotlin.Boolean
}

@JvmName("lt")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  OrderDeprecation,
  ReplaceWith("this < arg1", "arrow.core.compareTo")
)
fun <A, B, C, D, E, F, G, H, I> Tuple9<A, B, C, D, E, F, G, H, I>.lt(
  OA: Order<A>,
  OB: Order<B>,
  OC: Order<C>,
  OD: Order<D>,
  OE: Order<E>,
  OF: Order<F>,
  OG: Order<G>,
  OH: Order<H>,
  OI: Order<I>,
  arg1: Tuple9<A, B, C, D, E, F, G, H, I>
): Boolean = arrow.core.Tuple9.order<A, B, C, D, E, F, G, H,
    I>(OA, OB, OC, OD, OE, OF, OG, OH, OI).run {
  this@lt.lt(arg1) as kotlin.Boolean
}

@JvmName("lte")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  OrderDeprecation,
  ReplaceWith("this <= arg1", "arrow.core.compareTo")
)
fun <A, B, C, D, E, F, G, H, I> Tuple9<A, B, C, D, E, F, G, H, I>.lte(
  OA: Order<A>,
  OB: Order<B>,
  OC: Order<C>,
  OD: Order<D>,
  OE: Order<E>,
  OF: Order<F>,
  OG: Order<G>,
  OH: Order<H>,
  OI: Order<I>,
  arg1: Tuple9<A, B, C, D, E, F, G, H, I>
): Boolean = arrow.core.Tuple9.order<A, B, C, D, E, F, G, H,
    I>(OA, OB, OC, OD, OE, OF, OG, OH, OI).run {
  this@lte.lte(arg1) as kotlin.Boolean
}

@JvmName("gt")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  OrderDeprecation,
  ReplaceWith("this > arg1", "arrow.core.compareTo")
)
fun <A, B, C, D, E, F, G, H, I> Tuple9<A, B, C, D, E, F, G, H, I>.gt(
  OA: Order<A>,
  OB: Order<B>,
  OC: Order<C>,
  OD: Order<D>,
  OE: Order<E>,
  OF: Order<F>,
  OG: Order<G>,
  OH: Order<H>,
  OI: Order<I>,
  arg1: Tuple9<A, B, C, D, E, F, G, H, I>
): Boolean = arrow.core.Tuple9.order<A, B, C, D, E, F, G, H,
    I>(OA, OB, OC, OD, OE, OF, OG, OH, OI).run {
  this@gt.gt(arg1) as kotlin.Boolean
}

@JvmName("gte")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  OrderDeprecation,
  ReplaceWith("this >= arg1", "arrow.core.compareTo")
)
fun <A, B, C, D, E, F, G, H, I> Tuple9<A, B, C, D, E, F, G, H, I>.gte(
  OA: Order<A>,
  OB: Order<B>,
  OC: Order<C>,
  OD: Order<D>,
  OE: Order<E>,
  OF: Order<F>,
  OG: Order<G>,
  OH: Order<H>,
  OI: Order<I>,
  arg1: Tuple9<A, B, C, D, E, F, G, H, I>
): Boolean = arrow.core.Tuple9.order<A, B, C, D, E, F, G, H,
    I>(OA, OB, OC, OD, OE, OF, OG, OH, OI).run {
  this@gte.gte(arg1) as kotlin.Boolean
}

@JvmName("max")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  OrderDeprecation,
  ReplaceWith("maxOf(this,arg1)")
)
fun <A, B, C, D, E, F, G, H, I> Tuple9<A, B, C, D, E, F, G, H, I>.max(
  OA: Order<A>,
  OB: Order<B>,
  OC: Order<C>,
  OD: Order<D>,
  OE: Order<E>,
  OF: Order<F>,
  OG: Order<G>,
  OH: Order<H>,
  OI: Order<I>,
  arg1: Tuple9<A, B, C, D, E, F, G, H, I>
): Tuple9<A, B, C, D, E, F, G, H, I> = arrow.core.Tuple9.order<A, B, C, D, E, F, G, H,
    I>(OA, OB, OC, OD, OE, OF, OG, OH, OI).run {
  this@max.max(arg1) as arrow.core.Tuple9<A, B, C, D, E, F, G, H, I>
}

@JvmName("min")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  OrderDeprecation,
  ReplaceWith("minOf(this,arg1)")
)
fun <A, B, C, D, E, F, G, H, I> Tuple9<A, B, C, D, E, F, G, H, I>.min(
  OA: Order<A>,
  OB: Order<B>,
  OC: Order<C>,
  OD: Order<D>,
  OE: Order<E>,
  OF: Order<F>,
  OG: Order<G>,
  OH: Order<H>,
  OI: Order<I>,
  arg1: Tuple9<A, B, C, D, E, F, G, H, I>
): Tuple9<A, B, C, D, E, F, G, H, I> = arrow.core.Tuple9.order<A, B, C, D, E, F, G, H,
    I>(OA, OB, OC, OD, OE, OF, OG, OH, OI).run {
  this@min.min(arg1) as arrow.core.Tuple9<A, B, C, D, E, F, G, H, I>
}

@JvmName("sort")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  OrderDeprecation,
  ReplaceWith("sort(this, arg1).let { (a, b) -> Tuple2(b, a) }", "arrow.core.Tuple2", "arrow.core.sort")
)
fun <A, B, C, D, E, F, G, H, I> Tuple9<A, B, C, D, E, F, G, H, I>.sort(
  OA: Order<A>,
  OB: Order<B>,
  OC: Order<C>,
  OD: Order<D>,
  OE: Order<E>,
  OF: Order<F>,
  OG: Order<G>,
  OH: Order<H>,
  OI: Order<I>,
  arg1: Tuple9<A, B, C, D, E, F, G, H, I>
): Tuple2<Tuple9<A, B, C, D, E, F, G, H, I>, Tuple9<A, B, C, D, E, F, G, H, I>> =
    arrow.core.Tuple9.order<A, B, C, D, E, F, G, H, I>(OA, OB, OC, OD, OE, OF, OG, OH, OI).run {
  this@sort.sort(arg1) as arrow.core.Tuple2<arrow.core.Tuple9<A, B, C, D, E, F, G, H, I>,
    arrow.core.Tuple9<A, B, C, D, E, F, G, H, I>>
}

@Suppress(
  "UNCHECKED_CAST",
  "NOTHING_TO_INLINE"
)
@Deprecated(OrderDeprecation)
inline fun <A, B, C, D, E, F, G, H, I> Companion.order(
  OA: Order<A>,
  OB: Order<B>,
  OC: Order<C>,
  OD: Order<D>,
  OE: Order<E>,
  OF: Order<F>,
  OG: Order<G>,
  OH: Order<H>,
  OI: Order<I>
): Tuple9Order<A, B, C, D, E, F, G, H, I> = object : arrow.core.extensions.Tuple9Order<A, B, C, D,
    E, F, G, H, I> { override fun OA(): arrow.typeclasses.Order<A> = OA

  override fun OB(): arrow.typeclasses.Order<B> = OB

  override fun OC(): arrow.typeclasses.Order<C> = OC

  override fun OD(): arrow.typeclasses.Order<D> = OD

  override fun OE(): arrow.typeclasses.Order<E> = OE

  override fun OF(): arrow.typeclasses.Order<F> = OF

  override fun OG(): arrow.typeclasses.Order<G> = OG

  override fun OH(): arrow.typeclasses.Order<H> = OH

  override fun OI(): arrow.typeclasses.Order<I> = OI }
