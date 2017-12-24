package ru.startandroid.pincode.base.mvp;

/*
Интерфейс, который будет реализован всеми презентерами, которые будут работать по MVP.
Он содержит несколько методов, которые будут вызываться из View.
attachView(V mvpView) - метод для передачи View презентеру. Т.е. View вызовет его и передаст туда себя.
viewIsReady - сигнал презентеру о том, что View готово к работе. Презентер может начинать, например,
загружать данные.
detachView - презентер должен отпустить View. Вызывается, например, при повороте экрана,
когда уничтожается старый экземпляр Activity, или при закрытии Activity. Презентер должен обнулить
ссылку на Activity.
destroy - сигнал презентеру о том, что View завершает свою работу и будет закрыто.
 Т.е. Здесь необходимо отписываться от всех моделей, завершать все текущие операции и т.п.
*/

public interface MvpPresenter<V extends MvpView> {

    void attachView(V mvpView);

    void viewIsReady();

    void detachView();

    void destroy();
}
