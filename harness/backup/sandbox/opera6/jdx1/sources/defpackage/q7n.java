package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class q7n extends s7n {
    public static q7n c;
    public static final urj d = new urj((byte) 8);
    public final Application b;

    public q7n(Application application) {
        this.b = application;
    }

    public static l7n d(Class cls, Application application) {
        if (!kc1.class.isAssignableFrom(cls)) {
            return fsp.q(cls);
        }
        try {
            return (l7n) cls.getConstructor(Application.class).newInstance(application);
        } catch (IllegalAccessException e) {
            pza.l("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            pza.l("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            pza.l("Cannot create an instance of ", cls, e3);
            return null;
        } catch (InvocationTargetException e4) {
            pza.l("Cannot create an instance of ", cls, e4);
            return null;
        }
    }

    @Override // defpackage.s7n
    public final l7n a(Class cls, dde ddeVar) {
        if (this.b != null) {
            return c(cls);
        }
        Application application = (Application) ddeVar.a.get(d);
        if (application != null) {
            return d(cls, application);
        }
        if (!kc1.class.isAssignableFrom(cls)) {
            return fsp.q(cls);
        }
        qp2.o("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    @Override // defpackage.s7n
    public final l7n c(Class cls) {
        Application application = this.b;
        if (application != null) {
            return d(cls, application);
        }
        yt7.k("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }
}
