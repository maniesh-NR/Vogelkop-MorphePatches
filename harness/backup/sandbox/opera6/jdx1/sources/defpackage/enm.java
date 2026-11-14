package defpackage;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class enm extends fnm {
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ enm(Unsafe unsafe, byte b) {
        super(unsafe, (byte) 1);
        this.c = b;
    }

    private final boolean n(long j, Object obj) {
        return ((fnm) this).b.getBoolean(obj, j);
    }

    private final double o(long j, Object obj) {
        return ((fnm) this).b.getDouble(obj, j);
    }

    private final float p(long j, Object obj) {
        return ((fnm) this).b.getFloat(obj, j);
    }

    private final void q(Object obj, long j, boolean z) {
        ((fnm) this).b.putBoolean(obj, j, z);
    }

    private final void r(long j, Object obj, byte b) {
        ((fnm) this).b.putByte(obj, j, b);
    }

    private final void s(Object obj, long j, double d) {
        ((fnm) this).b.putDouble(obj, j, d);
    }

    private final void t(Object obj, long j, float f) {
        ((fnm) this).b.putFloat(obj, j, f);
    }

    public final boolean d(Object obj, long j) {
        switch (this.c) {
            case 0:
                return hnm.g ? hnm.f(obj, j) : ((byte) ((hnm.g(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
            case 1:
                return hnm.g ? hnm.f(obj, j) : ((byte) ((hnm.g(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
            default:
                return n(j, obj);
        }
    }

    public final double f(Object obj, long j) {
        switch (this.c) {
            case 0:
                return Double.longBitsToDouble(((fnm) this).b.getLong(obj, j));
            case 1:
                return Double.longBitsToDouble(((fnm) this).b.getLong(obj, j));
            default:
                return o(j, obj);
        }
    }

    public final float g(Object obj, long j) {
        switch (this.c) {
            case 0:
                return Float.intBitsToFloat(((fnm) this).b.getInt(obj, j));
            case 1:
                return Float.intBitsToFloat(((fnm) this).b.getInt(obj, j));
            default:
                return p(j, obj);
        }
    }

    public final void h(Object obj, long j, boolean z) {
        switch (this.c) {
            case 0:
                if (!hnm.g) {
                    hnm.m(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    hnm.l(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
            case 1:
                if (!hnm.g) {
                    hnm.m(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    hnm.l(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                q(obj, j, z);
                break;
        }
    }

    public final void i(Object obj, long j, byte b) {
        switch (this.c) {
            case 0:
                if (!hnm.g) {
                    hnm.m(obj, j, b);
                    break;
                } else {
                    hnm.l(obj, j, b);
                    break;
                }
            case 1:
                if (!hnm.g) {
                    hnm.m(obj, j, b);
                    break;
                } else {
                    hnm.l(obj, j, b);
                    break;
                }
            default:
                r(j, obj, b);
                break;
        }
    }

    public final void j(Object obj, long j, double d) {
        switch (this.c) {
            case 0:
                ((fnm) this).b.putLong(obj, j, Double.doubleToLongBits(d));
                break;
            case 1:
                ((fnm) this).b.putLong(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                s(obj, j, d);
                break;
        }
    }

    public final void k(Object obj, long j, float f) {
        switch (this.c) {
            case 0:
                ((fnm) this).b.putInt(obj, j, Float.floatToIntBits(f));
                break;
            case 1:
                ((fnm) this).b.putInt(obj, j, Float.floatToIntBits(f));
                break;
            default:
                t(obj, j, f);
                break;
        }
    }

    public final boolean l() {
        switch (this.c) {
            case 2:
                if (!super.l()) {
                    return false;
                }
                try {
                    Class<?> cls = ((fnm) this).b.getClass();
                    Class cls2 = Long.TYPE;
                    cls.getMethod("getByte", Object.class, cls2);
                    cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                    cls.getMethod("getBoolean", Object.class, cls2);
                    cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                    cls.getMethod("getFloat", Object.class, cls2);
                    cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                    cls.getMethod("getDouble", Object.class, cls2);
                    cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                    return true;
                } catch (Throwable th) {
                    hnm.j(th);
                    return false;
                }
            default:
                return super.l();
        }
    }

    public final boolean m() {
        switch (this.c) {
            case 0:
            case 1:
                break;
            default:
                Unsafe unsafe = ((fnm) this).b;
                if (unsafe != null) {
                    try {
                        Class<?> cls = unsafe.getClass();
                        cls.getMethod("objectFieldOffset", Field.class);
                        Class cls2 = Long.TYPE;
                        cls.getMethod("getLong", Object.class, cls2);
                        if (hnm.d() != null) {
                            try {
                                Class<?> cls3 = unsafe.getClass();
                                cls3.getMethod("getByte", cls2);
                                cls3.getMethod("putByte", cls2, Byte.TYPE);
                                cls3.getMethod("getInt", cls2);
                                cls3.getMethod("putInt", cls2, Integer.TYPE);
                                cls3.getMethod("getLong", cls2);
                                cls3.getMethod("putLong", cls2, cls2);
                                cls3.getMethod("copyMemory", cls2, cls2, cls2);
                                cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                                break;
                            } catch (Throwable th) {
                                hnm.j(th);
                                return false;
                            }
                        }
                    } catch (Throwable th2) {
                        hnm.j(th2);
                        return false;
                    }
                }
                break;
        }
        return false;
    }
}
