package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class e2n {
    public final hkj a;
    public final hkj b;
    public final hkj c;

    public e2n(hkj hkjVar, hkj hkjVar2, hkj hkjVar3) {
        this.a = hkjVar;
        this.b = hkjVar2;
        this.c = hkjVar3;
    }

    public abstract f2n a();

    public final Class b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        hkj hkjVar = this.c;
        Class cls2 = (Class) hkjVar.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(p3p.m(cls.getPackage().getName(), ".", cls.getSimpleName(), "Parcelizer"), false, cls.getClassLoader());
        hkjVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException, SecurityException {
        hkj hkjVar = this.a;
        Method method = (Method) hkjVar.get(str);
        if (method != null) {
            return method;
        }
        Method declaredMethod = Class.forName(str, false, e2n.class.getClassLoader()).getDeclaredMethod("read", e2n.class);
        hkjVar.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) throws NoSuchMethodException, SecurityException {
        String name = cls.getName();
        hkj hkjVar = this.b;
        Method method = (Method) hkjVar.get(name);
        if (method != null) {
            return method;
        }
        Method declaredMethod = b(cls).getDeclaredMethod("write", cls, e2n.class);
        hkjVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final int f(int i, int i2) {
        return !e(i2) ? i : ((f2n) this).e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((f2n) this).e.readParcelable(f2n.class.getClassLoader());
    }

    public final g2n h() {
        String string = ((f2n) this).e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (g2n) c(string).invoke(null, a());
        } catch (ClassNotFoundException e) {
            rqd.p(e);
            return null;
        } catch (IllegalAccessException e2) {
            rqd.p(e2);
            return null;
        } catch (NoSuchMethodException e3) {
            rqd.p(e3);
            return null;
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            rqd.p(e4);
            return null;
        }
    }

    public abstract void i(int i);

    public final void j(int i, int i2) {
        i(i2);
        ((f2n) this).e.writeInt(i);
    }

    public final void k(Parcelable parcelable, int i) {
        i(i);
        ((f2n) this).e.writeParcelable(parcelable, 0);
    }

    public final void l(g2n g2nVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (g2nVar == null) {
            ((f2n) this).e.writeString(null);
            return;
        }
        try {
            ((f2n) this).e.writeString(b(g2nVar.getClass()).getName());
            f2n f2nVarA = a();
            try {
                d(g2nVar.getClass()).invoke(null, g2nVar, f2nVarA);
                Parcel parcel = f2nVarA.e;
                int i = f2nVarA.i;
                if (i >= 0) {
                    int i2 = f2nVarA.d.get(i);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                rqd.p(e);
            } catch (IllegalAccessException e2) {
                rqd.p(e2);
            } catch (NoSuchMethodException e3) {
                rqd.p(e3);
            } catch (InvocationTargetException e4) {
                Throwable cause = e4.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                rqd.p(e4);
            }
        } catch (ClassNotFoundException e5) {
            h9o.s(g2nVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
