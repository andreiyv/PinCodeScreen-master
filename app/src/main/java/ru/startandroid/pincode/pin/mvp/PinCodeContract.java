package ru.startandroid.pincode.pin.mvp;

/*
В этом файле описаны интерфейсы для View и Presenter для экрана, который будет работать с пин кодом.

Полей для ввода пин кода будет всего три, поэтому названия методов содержат порядковые числительные: first, second, third.

В интерфейсе View описаны методы в основном для работы с полями ввода: отображение, получение текста, установка фокуса, очистка.
А также методы для показа сообщений пользователю, запуска следующего экрана и закрытия экрана.

В интерфейсе презентера описаны методы, которые будут вызываться, когда соответствующее поле будет полностью заполнено (когда пользователь ввел 4 символа).
 */

import ru.startandroid.pincode.base.mvp.MvpPresenter;
import ru.startandroid.pincode.base.mvp.MvpView;

public interface PinCodeContract {

    interface View extends MvpView {

        // show field with label
        void showFirst(int labelResId);
        void showSecond(int labelResId);
        void showThird(int labelResId);

        // get text from field
        String getTextFirst();
        String getTextSecond();
        String getTextThird();

        // set focus on field
        void focusFirst();
        void focusSecond();
        void focusThird();

        // clear all fields
        void clearAll();

        // show message to user
        void showMessage(int messageResId);

        // go to next screen
        void next();

        // close screen
        void close();
    }


    interface Presenter extends MvpPresenter<View> {

        // field is filled
        void onTextFirst();
        void onTextSecond();
        void onTextThird();
    }


}
