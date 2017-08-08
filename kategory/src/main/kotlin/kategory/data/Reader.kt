package kategory

infix fun <A, B, C> ((B) -> C).compose(f: (A) -> B): (A) -> C = { a: A -> this(f(a)) }

infix fun <A, B, C> ((A) -> B).andThen(g: (B) -> C): (A) -> C = { a: A -> g(this(a)) }

fun <D, A> ((D) -> A).reader(): ReaderT<Id.F, D, A> = Reader(this, Id)

fun <D, A> ReaderT<Id.F, D, A>.runId(d: D): A = this.run(d).value()

object Reader {

    operator fun <D, A> invoke(run: (D) -> A, MF: Monad<Id.F> = Id): ReaderT<Id.F, D, A> = Kleisli(run.andThen { Id(it) }, MF)

    fun <D, A> pure(x: A, MF: Monad<Id.F> = Id): ReaderT<Id.F, D, A> = Kleisli.pure<Id.F, D, A>(x, Id)

    fun <D> ask(MF: Monad<Id.F> = Id): ReaderT<Id.F, D, D> = Kleisli.ask<Id.F, D>(Id)

}