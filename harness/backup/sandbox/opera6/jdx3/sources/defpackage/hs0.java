package defpackage;

import com.leanplum.utils.SizeUtil;

/* loaded from: classes.dex */
public final class hs0 implements yc0 {
    public static final hs0 b = new hs0(0);
    public static final hs0 c = new hs0(1);
    public static final hs0 d = new hs0(2);
    public static final hs0 e = new hs0(3);
    public static final hs0 f = new hs0(4);
    public static final hs0 g = new hs0(5);
    public static final hs0 h = new hs0(6);
    public static final hs0 i = new hs0(7);
    public static final hs0 j = new hs0(8);
    public static final hs0 k = new hs0(9);
    public static final hs0 l = new hs0(10);
    public static final hs0 m = new hs0(11);
    public static final hs0 n = new hs0(12);
    public static final hs0 o = new hs0(13);
    public static final hs0 p = new hs0(14);
    public static final hs0 q = new hs0(15);
    public static final hs0 r = new hs0(16);
    public static final hs0 s = new hs0(17);
    public static final hs0 t = new hs0(18);
    public static final hs0 u = new hs0(19);
    public static final hs0 v = new hs0(20);
    public static final hs0 w = new hs0(21);
    public static final hs0 x = new hs0(22);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public hs0(int i2) {
        this.a = i2;
    }

    public static final hs0 a(int i2) {
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
            case SizeUtil.textSize1 /* 22 */:
                return x;
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
