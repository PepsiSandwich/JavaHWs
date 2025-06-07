package edu.phystech.hw3.result;

import java.util.function.Function;

public final class Success<T> implements Result<T> {
    private final T value;

    public Success(T value) {
        this.value = value;
    }

    @Override
    public boolean isFailure() {
        return false;
    }

    @Override
    public boolean isSuccess() {
        return true;
    }

    @Override
    public T getOrDefault(T defaultValue) {
        return value;              // Возвращаем значение
    }

    @Override
    public Throwable getExceptionOrNull() {
        return null;               // В успешном результате ошибки нет
    }

    @Override
    public <R> Result<R> map(Function<? super T, ? extends R> transform) {
        try {
            return new Success<>(transform.apply(value));
        } catch (Throwable e) {
            return new Failure<>(e);
        }
    }
}
