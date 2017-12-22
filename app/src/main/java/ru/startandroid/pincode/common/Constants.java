package ru.startandroid.pincode.common;

// Здесь описаны Enum для режимов экрана и текстовый ключ, для помещения данных в intent.

public class Constants {

    public enum PinCodeMode {
        CREATE, CHECK, CHANGE;
    }

    public static final String EXTRA_MODE = "mode";

}
