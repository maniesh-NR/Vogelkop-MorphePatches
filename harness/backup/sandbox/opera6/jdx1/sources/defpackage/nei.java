package defpackage;

/* loaded from: classes.dex */
public final class nei implements Cloneable {
    public final float a;
    public final int b;

    public nei(float f) {
        this.a = f;
        this.b = 1;
    }

    public nei(float f, int i) {
        this.a = f;
        this.b = i;
    }

    public final float b() {
        float f;
        float f2;
        int iA = vep.A(this.b);
        float f3 = this.a;
        if (iA == 0) {
            return f3;
        }
        if (iA == 3) {
            return f3 * 96.0f;
        }
        if (iA == 4) {
            f = f3 * 96.0f;
            f2 = 2.54f;
        } else if (iA == 5) {
            f = f3 * 96.0f;
            f2 = 25.4f;
        } else if (iA == 6) {
            f = f3 * 96.0f;
            f2 = 72.0f;
        } else {
            if (iA != 7) {
                return f3;
            }
            f = f3 * 96.0f;
            f2 = 6.0f;
        }
        return f / f2;
    }

    public final float c(igi igiVar) {
        if (this.b != 9) {
            return f(igiVar);
        }
        ggi ggiVar = (ggi) igiVar.d;
        ree reeVar = ggiVar.g;
        if (reeVar == null) {
            reeVar = ggiVar.f;
        }
        float f = this.a;
        if (reeVar == null) {
            return f;
        }
        float fSqrt = reeVar.d;
        if (fSqrt != reeVar.e) {
            fSqrt = (float) (Math.sqrt((r0 * r0) + (fSqrt * fSqrt)) / 1.414213562373095d);
        }
        return (f * fSqrt) / 100.0f;
    }

    public final float e(igi igiVar, float f) {
        return this.b == 9 ? (this.a * f) / 100.0f : f(igiVar);
    }

    public final float f(igi igiVar) {
        float textSize;
        int iA = vep.A(this.b);
        float f = this.a;
        switch (iA) {
            case 1:
                textSize = ((ggi) igiVar.d).d.getTextSize();
                break;
            case 2:
                textSize = ((ggi) igiVar.d).d.getTextSize() / 2.0f;
                break;
            case 3:
                igiVar.getClass();
                return f * 96.0f;
            case 4:
                igiVar.getClass();
                return (f * 96.0f) / 2.54f;
            case 5:
                igiVar.getClass();
                return (f * 96.0f) / 25.4f;
            case 6:
                igiVar.getClass();
                return (f * 96.0f) / 72.0f;
            case 7:
                igiVar.getClass();
                return (f * 96.0f) / 6.0f;
            case 8:
                ggi ggiVar = (ggi) igiVar.d;
                ree reeVar = ggiVar.g;
                if (reeVar == null) {
                    reeVar = ggiVar.f;
                }
                if (reeVar != null) {
                    return (f * reeVar.d) / 100.0f;
                }
            default:
                return f;
        }
        return textSize * f;
    }

    public final float g(igi igiVar) {
        if (this.b != 9) {
            return f(igiVar);
        }
        ggi ggiVar = (ggi) igiVar.d;
        ree reeVar = ggiVar.g;
        if (reeVar == null) {
            reeVar = ggiVar.f;
        }
        float f = this.a;
        return reeVar == null ? f : (f * reeVar.e) / 100.0f;
    }

    public final boolean i() {
        return this.a < 0.0f;
    }

    public final boolean j() {
        return this.a == 0.0f;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(this.a));
        switch (this.b) {
            case 1:
                str = "px";
                break;
            case 2:
                str = "em";
                break;
            case 3:
                str = "ex";
                break;
            case 4:
                str = "in";
                break;
            case 5:
                str = "cm";
                break;
            case 6:
                str = "mm";
                break;
            case 7:
                str = "pt";
                break;
            case 8:
                str = "pc";
                break;
            case 9:
                str = "percent";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        return sb.toString();
    }
}
