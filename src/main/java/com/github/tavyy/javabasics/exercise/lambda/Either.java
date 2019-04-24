package com.github.tavyy.javabasics.exercise.lambda;

import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 *
 * @param <L>
 * @param <R>
 */
public interface Either<L, R> {

    /**
     * @return the value from this `Left` or throws `java.util.NoSuchElementException` if this is a `Right`
     */
    L getLeft();

    /**
     * @return the value from this `Right` or throws `java.util.NoSuchElementException` if this is a `Left`
     */
    R getRight();

    /**
     * @return the value from this `Right` or the given argument if this is a `Left`.
     */
    R getOrElse(Supplier<? extends R> defaultValue);

    /**
     * @return `false` if `Left` or returns the result of the given predicate to the `Right` value.
     */
    boolean exists(Predicate<R> predicate);

    /**
     * @return `true` if this is a `Left`, `false` otherwise.
     */
    boolean isLeft();

    /**
     * @return `true` if this is a `Right`, `false` otherwise.
     */
    boolean isRight();

    /**
     * Implements the right side of the disjoint union, as opposed to the left side.
     */
    abstract class Left<L, R> implements Either<L, R>{}

    /**
     * Implements the left side of the disjoint union, as opposed to the right side.
     */
    abstract class Right<L, R> implements Either<L, R>{}

}
