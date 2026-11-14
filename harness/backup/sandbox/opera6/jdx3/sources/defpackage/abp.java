package defpackage;

/* loaded from: classes.dex */
public final class abp extends sj2 {
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ abp(String str, byte b) {
        super(str);
        this.f = b;
    }

    public static boolean j(Character ch) {
        char cCharValue = ch.charValue();
        if (cCharValue >= '0' && cCharValue <= '9') {
            return true;
        }
        if (cCharValue < 'a' || cCharValue > 'f') {
            return cCharValue >= 'A' && cCharValue <= 'F';
        }
        return true;
    }

    public static boolean k(Character ch) {
        char cCharValue;
        return ch != null && (cCharValue = ch.charValue()) >= '0' && cCharValue <= '7';
    }

    @Override // defpackage.sj2
    public final void a() {
        switch (this.f) {
            case 0:
                this.e = this.d;
                this.b = this.a;
                break;
            default:
                this.e = this.d;
                this.b = this.a;
                break;
        }
    }

    @Override // defpackage.sj2
    public final boolean b(Object obj) {
        byte b = this.f;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                Integer num = (Integer) obj;
                String str = (String) obj2;
                Object obj3 = this.d;
                if ((obj3 != null && ((Integer) obj3).intValue() == num.intValue()) || (str != null && str.length() != 0 && this.a < str.length() && str.codePointAt(this.a) == num.intValue())) {
                    break;
                }
                break;
            default:
                Character ch = (Character) obj;
                String str2 = (String) obj2;
                Object obj4 = this.d;
                if ((obj4 != null && ((Character) obj4).charValue() == ch.charValue()) || (str2 != null && str2.length() != 0 && this.a < str2.length() && str2.charAt(this.a) == ch.charValue())) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // defpackage.sj2
    public final Object c() {
        byte b = this.f;
        Object obj = this.c;
        switch (b) {
            case 0:
                String str = (String) obj;
                Object obj2 = this.d;
                if (obj2 != null) {
                    return (Integer) obj2;
                }
                if (str == null || str.length() == 0 || this.a >= str.length()) {
                    return null;
                }
                return Integer.valueOf(str.codePointAt(this.a));
            default:
                String str2 = (String) obj;
                Object obj3 = this.d;
                if (obj3 != null) {
                    return (Character) obj3;
                }
                if (str2 == null || str2.length() == 0 || this.a >= str2.length()) {
                    return null;
                }
                return Character.valueOf(str2.charAt(this.a));
        }
    }

    @Override // defpackage.sj2
    public final Object d() {
        switch (this.f) {
            case 0:
                Integer numM = m();
                if (numM == null) {
                    return null;
                }
                if ((numM.intValue() < 48 || numM.intValue() > 57) && ((numM.intValue() < 97 || numM.intValue() > 102) && (numM.intValue() < 65 || numM.intValue() > 70))) {
                    return null;
                }
                return numM;
            default:
                Character chL = l();
                if (chL == null || !j(chL)) {
                    return null;
                }
                return chL;
        }
    }

    @Override // defpackage.sj2
    public final boolean f() {
        switch (this.f) {
            case 1:
                String str = (String) this.c;
                if (this.d == null) {
                    return (str == null || str.length() == 0 || this.a >= str.length()) ? false : true;
                }
                return true;
            default:
                return super.f();
        }
    }

    @Override // defpackage.sj2
    public final void h() {
        switch (this.f) {
            case 0:
                this.d = this.e;
                this.a = this.b;
                break;
            default:
                this.d = this.e;
                this.a = this.b;
                break;
        }
    }

    public final Character l() {
        String str = (String) this.c;
        Object obj = this.d;
        if (obj != null) {
            Character ch = (Character) obj;
            this.d = null;
            return ch;
        }
        if (str == null || str.length() == 0 || this.a >= str.length()) {
            return null;
        }
        int i = this.a;
        this.a = i + 1;
        return Character.valueOf(str.charAt(i));
    }

    public final Integer m() {
        String str = (String) this.c;
        Object obj = this.d;
        if (obj != null) {
            Integer num = (Integer) obj;
            this.d = null;
            return num;
        }
        if (str == null || str.length() == 0 || this.a >= str.length()) {
            return null;
        }
        int iCodePointAt = str.codePointAt(this.a);
        Integer numValueOf = Integer.valueOf(iCodePointAt);
        this.a = Character.charCount(iCodePointAt) + this.a;
        return numValueOf;
    }
}
