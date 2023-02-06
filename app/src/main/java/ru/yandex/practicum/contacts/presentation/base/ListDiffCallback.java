package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;

public interface ListDiffCallback<T> {
    public boolean theSameAs(@NonNull T other);

    public boolean equals(Object other);
}
