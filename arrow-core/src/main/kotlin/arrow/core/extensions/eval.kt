package arrow.core.extensions

import arrow.core.Either
import arrow.core.Eval
import arrow.core.EvalOf
import arrow.core.ForEval
import arrow.core.extensions.eval.monad.monad
import arrow.core.fix
import arrow.typeclasses.Applicative
import arrow.typeclasses.Apply
import arrow.typeclasses.Bimonad
import arrow.typeclasses.Comonad
import arrow.typeclasses.Functor
import arrow.typeclasses.Monad
import arrow.typeclasses.MonadSyntax
import arrow.typeclasses.MonadFx

@Deprecated("Functor typeclass is deprecated and will be removed in 0.13.0. Use concrete methods on Eval")
interface EvalFunctor : Functor<ForEval> {
  override fun <A, B> EvalOf<A>.map(f: (A) -> B): Eval<B> =
    fix().map(f)
}

@Deprecated("Apply typeclass is deprecated and will be removed in 0.13.0. Use concrete methods on Eval")
interface EvalApply : Apply<ForEval> {
  override fun <A, B> EvalOf<A>.ap(ff: EvalOf<(A) -> B>): Eval<B> =
    fix().ap(ff)

  override fun <A, B> EvalOf<A>.map(f: (A) -> B): Eval<B> =
    fix().map(f)
}

@Deprecated("Applicative typeclass is deprecated and will be removed in 0.13.0. Use concrete methods on Eval")
interface EvalApplicative : Applicative<ForEval> {
  override fun <A, B> EvalOf<A>.ap(ff: EvalOf<(A) -> B>): Eval<B> =
    fix().ap(ff)

  override fun <A, B> EvalOf<A>.map(f: (A) -> B): Eval<B> =
    fix().map(f)

  override fun <A> just(a: A): Eval<A> =
    Eval.just(a)
}

@Deprecated("Monad typeclass is deprecated and will be removed in 0.13.0. Use concrete methods on Eval")
interface EvalMonad : Monad<ForEval> {
  override fun <A, B> EvalOf<A>.ap(ff: EvalOf<(A) -> B>): Eval<B> =
    fix().ap(ff)

  override fun <A, B> EvalOf<A>.flatMap(f: (A) -> EvalOf<B>): Eval<B> =
    fix().flatMap(f)

  override fun <A, B> tailRecM(a: A, f: (A) -> EvalOf<Either<A, B>>): Eval<B> =
    Eval.tailRecM(a, f)

  override fun <A, B> EvalOf<A>.map(f: (A) -> B): Eval<B> =
    fix().map(f)

  override fun <A> just(a: A): Eval<A> =
    Eval.just(a)

  override val fx: MonadFx<ForEval>
    get() = EvalFxMonad
}

@Deprecated("MonadFx typeclass is deprecated and will be removed in 0.13.0. Use concrete methods on Eval")
internal object EvalFxMonad : MonadFx<ForEval> {
  override val M: Monad<ForEval> = Eval.monad()
  override fun <A> monad(c: suspend MonadSyntax<ForEval>.() -> A): Eval<A> =
    super.monad(c).fix()
}

@Deprecated("Comonad typeclass is deprecated and will be removed in 0.13.0. Use concrete methods on Eval")
interface EvalComonad : Comonad<ForEval> {
  override fun <A, B> EvalOf<A>.coflatMap(f: (EvalOf<A>) -> B): Eval<B> =
    fix().coflatMap(f)

  override fun <A> EvalOf<A>.extract(): A =
    fix().extract()

  override fun <A, B> EvalOf<A>.map(f: (A) -> B): Eval<B> =
    fix().map(f)
}

@Deprecated("Bimonad typeclass is deprecated and will be removed in 0.13.0. Use concrete methods on Eval")
interface EvalBimonad : Bimonad<ForEval> {
  override fun <A, B> EvalOf<A>.ap(ff: EvalOf<(A) -> B>): Eval<B> =
    fix().ap(ff)

  override fun <A, B> EvalOf<A>.flatMap(f: (A) -> EvalOf<B>): Eval<B> =
    fix().flatMap(f)

  override fun <A, B> tailRecM(a: A, f: (A) -> EvalOf<Either<A, B>>): Eval<B> =
    Eval.tailRecM(a, f)

  override fun <A, B> EvalOf<A>.map(f: (A) -> B): Eval<B> =
    fix().map(f)

  override fun <A> just(a: A): Eval<A> =
    Eval.just(a)

  override fun <A, B> EvalOf<A>.coflatMap(f: (EvalOf<A>) -> B): Eval<B> =
    fix().coflatMap(f)

  override fun <A> EvalOf<A>.extract(): A =
    fix().extract()
}

@Deprecated("Fx blocks are now named based on each datatype, please use `eval { }` instead",
  replaceWith = ReplaceWith("eval.eager(c)"))
fun <B> Eval.Companion.fx(c: suspend MonadSyntax<ForEval>.() -> B): Eval<B> =
  defer { Eval.monad().fx.monad(c).fix() }
