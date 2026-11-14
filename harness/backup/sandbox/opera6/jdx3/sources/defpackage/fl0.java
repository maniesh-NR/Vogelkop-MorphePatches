package defpackage;

import com.leanplum.utils.SizeUtil;

/* loaded from: classes.dex */
public final class fl0 implements yc0 {
    public static final fl0 b = new fl0(0);
    public static final fl0 c = new fl0(1);
    public static final fl0 d = new fl0(2);
    public static final fl0 e = new fl0(3);
    public static final fl0 f = new fl0(4);
    public static final fl0 g = new fl0(5);
    public static final fl0 h = new fl0(6);
    public static final fl0 i = new fl0(7);
    public static final fl0 j = new fl0(8);
    public static final fl0 k = new fl0(9);
    public static final fl0 l = new fl0(10);
    public static final fl0 m = new fl0(11);
    public static final fl0 n = new fl0(12);
    public static final fl0 o = new fl0(13);
    public static final fl0 p = new fl0(14);
    public static final fl0 q = new fl0(15);
    public static final fl0 r = new fl0(16);
    public static final fl0 s = new fl0(17);
    public static final fl0 t = new fl0(18);
    public static final fl0 u = new fl0(19);
    public static final fl0 v = new fl0(20);
    public static final fl0 w = new fl0(21);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public fl0(int i2) {
        this.a = i2;
    }

    public static final fl0 a(int i2) {
        switch (i2) {
            case 0:
                return b;
            case 1:
                return c;
            case 2:
                return d;
            case 3:
                return e;
            case 4:
                return f;
            case 5:
                return g;
            case 6:
                return h;
            case 7:
                return i;
            case 8:
                return j;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return k;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return l;
            case 11:
                return m;
            case 12:
                return n;
            case 13:
                return o;
            case 14:
                return p;
            case 15:
                return q;
            case 16:
                return r;
            case 17:
                return s;
            case SizeUtil.textSize0_1 /* 18 */:
                return t;
            case 19:
                return u;
            case SizeUtil.textSize0 /* 20 */:
                return v;
            case 21:
                return w;
            default:
                hai.d();
                return null;
        }
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a;
    }
}
