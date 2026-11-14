package defpackage;

import java.io.Serializable;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class k8b {
    public final /* synthetic */ byte a;
    public final pga b;
    public final pga c;
    public final pga d;
    public final pga e;
    public final Serializable f;

    public k8b(String str) {
        this.a = (byte) 1;
        this.f = str;
        this.b = new pga(null, (byte) 1);
        this.c = new pga(null, (byte) 0);
        this.d = new pga(null, (byte) 1);
        this.e = new pga(null, (byte) 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k8b(k8b[] k8bVarArr) {
        final byte b = 0;
        this.a = (byte) 0;
        this.f = k8bVarArr;
        int length = k8bVarArr.length;
        final pga[] pgaVarArr = new pga[length];
        for (int i = 0; i < length; i++) {
            pgaVarArr[i] = ((k8b[]) this.f)[i].b();
        }
        final byte b2 = 1;
        this.b = new pga(new Function2() { // from class: i2n
            public final Object invoke(Object obj, Object obj2) {
                float fQ;
                byte b3 = b2;
                pga[] pgaVarArr2 = pgaVarArr;
                p1d p1dVar = (p1d) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (b3) {
                    case 0:
                        fQ = xvg.q(p1dVar, false, pgaVarArr2, fFloatValue);
                        break;
                    default:
                        fQ = xvg.q(p1dVar, true, pgaVarArr2, fFloatValue);
                        break;
                }
                return Float.valueOf(fQ);
            }
        }, (byte) 1);
        int length2 = ((k8b[]) this.f).length;
        final pga[] pgaVarArr2 = new pga[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            pgaVarArr2[i2] = ((k8b[]) this.f)[i2].d();
        }
        this.c = new pga(new Function2() { // from class: oga
            public final Object invoke(Object obj, Object obj2) {
                float fQ;
                byte b3 = b2;
                pga[] pgaVarArr3 = pgaVarArr2;
                p1d p1dVar = (p1d) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (b3) {
                    case 0:
                        fQ = xvg.q(p1dVar, false, pgaVarArr3, fFloatValue);
                        break;
                    default:
                        fQ = xvg.q(p1dVar, true, pgaVarArr3, fFloatValue);
                        break;
                }
                return Float.valueOf(fQ);
            }
        }, (byte) 0);
        int length3 = ((k8b[]) this.f).length;
        final pga[] pgaVarArr3 = new pga[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            pgaVarArr3[i3] = ((k8b[]) this.f)[i3].c();
        }
        this.d = new pga(new Function2() { // from class: i2n
            public final Object invoke(Object obj, Object obj2) {
                float fQ;
                byte b3 = b;
                pga[] pgaVarArr22 = pgaVarArr3;
                p1d p1dVar = (p1d) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (b3) {
                    case 0:
                        fQ = xvg.q(p1dVar, false, pgaVarArr22, fFloatValue);
                        break;
                    default:
                        fQ = xvg.q(p1dVar, true, pgaVarArr22, fFloatValue);
                        break;
                }
                return Float.valueOf(fQ);
            }
        }, (byte) 1);
        int length4 = ((k8b[]) this.f).length;
        final pga[] pgaVarArr4 = new pga[length4];
        for (int i4 = 0; i4 < length4; i4++) {
            pgaVarArr4[i4] = ((k8b[]) this.f)[i4].a();
        }
        this.e = new pga(new Function2() { // from class: oga
            public final Object invoke(Object obj, Object obj2) {
                float fQ;
                byte b3 = b;
                pga[] pgaVarArr32 = pgaVarArr4;
                p1d p1dVar = (p1d) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (b3) {
                    case 0:
                        fQ = xvg.q(p1dVar, false, pgaVarArr32, fFloatValue);
                        break;
                    default:
                        fQ = xvg.q(p1dVar, true, pgaVarArr32, fFloatValue);
                        break;
                }
                return Float.valueOf(fQ);
            }
        }, (byte) 0);
    }

    public final pga a() {
        byte b = this.a;
        return this.e;
    }

    public final pga b() {
        byte b = this.a;
        return this.b;
    }

    public final pga c() {
        byte b = this.a;
        return this.d;
    }

    public final pga d() {
        byte b = this.a;
        return this.c;
    }

    public final String toString() {
        byte b = this.a;
        Object obj = this.f;
        switch (b) {
            case 0:
                return e82.x((k8b[]) obj, (String) null, "innermostOf(", ")", (tb6) null, 57);
            default:
                return sko.k("RectRulers(", (String) obj, ")");
        }
    }
}
