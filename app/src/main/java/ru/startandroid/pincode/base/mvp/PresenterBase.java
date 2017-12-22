package ru.startandroid.pincode.base.mvp;

/*
Небольшой базовый класс, который будет наследоваться всеми презентерами.
В нем реализованы общие методы по работе с View. В этом примере он достаточно прост.
Но обычно здесь располагаются также механизмы для сбора RxJava подписок,
которые завершаются в методе destroy.
*/

public abstract class PresenterBase<T extends MvpView> implements MvpPresenter<T> {

    private T view;

    @Override
    public void attachView(T mvpView) {
        view = mvpView;
    }

    @Override
    public void detachView() {
        view = null;
    }

    public T getView() {
        return view;
    }

    protected boolean isViewAttached() {
        return view != null;
    }

    @Override
    public void destroy() {

    }
}
