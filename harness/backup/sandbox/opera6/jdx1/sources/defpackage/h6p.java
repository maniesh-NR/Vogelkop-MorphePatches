package defpackage;

import ads_mobile_sdk.ml3;
import ads_mobile_sdk.ov;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class h6p extends ov {
    public final /* synthetic */ byte l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h6p(Unsafe unsafe, byte b) {
        super(unsafe);
        this.l = b;
    }

    private final void q(Object obj, long j, double d) {
        ((Unsafe) this.a).putDouble(obj, j, d);
    }

    private final void r(Object obj, long j, float f) {
        ((Unsafe) this.a).putFloat(obj, j, f);
    }

    private final void s(Object obj, long j, boolean z) {
        ((Unsafe) this.a).putBoolean(obj, j, z);
    }

    private final boolean t(long j, Object obj) {
        return ((Unsafe) this.a).getBoolean(obj, j);
    }

    private final double u(long j, Object obj) {
        return ((Unsafe) this.a).getDouble(obj, j);
    }

    private final float v(long j, Object obj) {
        return ((Unsafe) this.a).getFloat(obj, j);
    }

    @Override // ads_mobile_sdk.ov
    public final void a(Object obj, long j, double d) {
        switch (this.l) {
            case 0:
                a(obj, j, Double.doubleToLongBits(d));
                break;
            case 1:
                a(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                q(obj, j, d);
                break;
        }
    }

    @Override // ads_mobile_sdk.ov
    public final void a(Object obj, long j, float f) {
        switch (this.l) {
            case 0:
                a(Float.floatToIntBits(f), j, obj);
                break;
            case 1:
                a(Float.floatToIntBits(f), j, obj);
                break;
            default:
                r(obj, j, f);
                break;
        }
    }

    @Override // ads_mobile_sdk.ov
    public final void a(Object obj, long j, boolean z) {
        switch (this.l) {
            case 0:
                if (!ml3.e) {
                    byte b = z ? (byte) 1 : (byte) 0;
                    long j2 = (-4) & j;
                    ov ovVar = ml3.c;
                    int i = (((int) j) & 3) << 3;
                    ovVar.a((((Unsafe) ovVar.a).getInt(obj, j2) & (~(255 << i))) | ((b & 255) << i), j2, obj);
                    break;
                } else {
                    byte b2 = z ? (byte) 1 : (byte) 0;
                    long j3 = (-4) & j;
                    ov ovVar2 = ml3.c;
                    int i2 = ((Unsafe) ovVar2.a).getInt(obj, j3);
                    int i3 = ((~((int) j)) & 3) << 3;
                    ovVar2.a((i2 & (~(255 << i3))) | ((b2 & 255) << i3), j3, obj);
                    break;
                }
            case 1:
                if (!ml3.e) {
                    byte b3 = z ? (byte) 1 : (byte) 0;
                    long j4 = (-4) & j;
                    ov ovVar3 = ml3.c;
                    int i4 = (((int) j) & 3) << 3;
                    ovVar3.a((((Unsafe) ovVar3.a).getInt(obj, j4) & (~(255 << i4))) | ((b3 & 255) << i4), j4, obj);
                    break;
                } else {
                    byte b4 = z ? (byte) 1 : (byte) 0;
                    long j5 = (-4) & j;
                    ov ovVar4 = ml3.c;
                    int i5 = ((Unsafe) ovVar4.a).getInt(obj, j5);
                    int i6 = ((~((int) j)) & 3) << 3;
                    ovVar4.a((i5 & (~(255 << i6))) | ((b4 & 255) << i6), j5, obj);
                    break;
                }
            default:
                s(obj, j, z);
                break;
        }
    }

    @Override // ads_mobile_sdk.ov
    /* renamed from: a */
    public final boolean mo6a() {
        switch (this.l) {
            case 2:
                if (!super.mo6a()) {
                    return false;
                }
                try {
                    Class<?> cls = ((Unsafe) this.a).getClass();
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
                    ml3.a(th);
                    return false;
                }
            default:
                return super.mo6a();
        }
    }

    @Override // ads_mobile_sdk.ov
    public final boolean a(long j, Object obj) {
        switch (this.l) {
            case 0:
                long j2 = (-4) & j;
                if (ml3.e) {
                    if (((byte) ((((Unsafe) ml3.c.a).getInt(obj, j2) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0) {
                        return true;
                    }
                } else if (((byte) ((((Unsafe) ml3.c.a).getInt(obj, j2) >>> ((int) ((j & 3) << 3))) & 255)) != 0) {
                    return true;
                }
                return false;
            case 1:
                long j3 = (-4) & j;
                if (ml3.e) {
                    if (((byte) ((((Unsafe) ml3.c.a).getInt(obj, j3) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0) {
                        return true;
                    }
                } else if (((byte) ((((Unsafe) ml3.c.a).getInt(obj, j3) >>> ((int) ((j & 3) << 3))) & 255)) != 0) {
                    return true;
                }
                return false;
            default:
                return t(j, obj);
        }
    }

    @Override // ads_mobile_sdk.ov
    public final double b(long j, Object obj) {
        switch (this.l) {
            case 0:
                return Double.longBitsToDouble(((Unsafe) this.a).getLong(obj, j));
            case 1:
                return Double.longBitsToDouble(((Unsafe) this.a).getLong(obj, j));
            default:
                return u(j, obj);
        }
    }

    @Override // ads_mobile_sdk.ov
    public final boolean b() {
        switch (this.l) {
            case 2:
                if (!super.b()) {
                    return false;
                }
                try {
                    Class<?> cls = ((Unsafe) this.a).getClass();
                    Class cls2 = Long.TYPE;
                    cls.getMethod("getByte", cls2);
                    cls.getMethod("putByte", cls2, Byte.TYPE);
                    cls.getMethod("getInt", cls2);
                    cls.getMethod("putInt", cls2, Integer.TYPE);
                    cls.getMethod("getLong", cls2);
                    cls.getMethod("putLong", cls2, cls2);
                    cls.getMethod("copyMemory", cls2, cls2, cls2);
                    cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                    return true;
                } catch (Throwable th) {
                    ml3.a(th);
                    return false;
                }
            default:
                return super.b();
        }
    }

    @Override // ads_mobile_sdk.ov
    public final float c(long j, Object obj) {
        switch (this.l) {
            case 0:
                return Float.intBitsToFloat(((Unsafe) this.a).getInt(obj, j));
            case 1:
                return Float.intBitsToFloat(((Unsafe) this.a).getInt(obj, j));
            default:
                return v(j, obj);
        }
    }
}
