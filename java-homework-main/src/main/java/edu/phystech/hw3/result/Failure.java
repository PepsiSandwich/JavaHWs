package edu.phystech.hw3.result;

import java.util.function.Function;

public final class Failure<T> implements Result<T> {
    private final Throwable e;

    public Failure(Throwable e) {
        this.e = e;
    }

    @Override
    public boolean isFailure() {
        return true;
    }

    @Override
    public boolean isSuccess() {
        return false;
    }

    @Override
    public T getOrDefault(T defaultValue) {
        return defaultValue;        // Возвращаем дефолт при ошибке
    }

    @Override
    public Throwable getExceptionOrNull() {
        return e;                  // Возвращаем исключение
    }

    @Override
    public <R> Result<R> map(Function<? super T, ? extends R> transform) {
        // При ошибке map возвращаем Failure с той же ошибкой
        return new Failure<>(e);
    }
}