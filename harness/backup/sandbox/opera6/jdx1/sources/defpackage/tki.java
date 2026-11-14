package defpackage;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class tki {
    public static final List a = Arrays.asList(Application.class, gki.class);
    public static final List b = Collections.singletonList(gki.class);

    public static final Constructor a(Class cls, List list) throws SecurityException {
        for (Constructor<?> constructor : cls.getConstructors()) {
            List listB = e82.B(constructor.getParameterTypes());
            if (Intrinsics.a(list, listB)) {
                return constructor;
            }
            if (list.size() == listB.size() && listB.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final l7n b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (l7n) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            pza.l("Failed to access ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            h9o.s(fki.q(cls, "A ", " cannot be instantiated."), e2);
            return null;
        } catch (InvocationTargetException e3) {
            h9o.s("An exception happened in constructor of " + cls, e3.getCause());
            return null;
        }
    }
}
