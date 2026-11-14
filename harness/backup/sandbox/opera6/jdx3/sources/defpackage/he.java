package defpackage;

import com.opera.android.autofill.passwords.picker.AutofillPasswordPickerActivity;

/* loaded from: classes.dex */
public final class he implements l24 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ he(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.l24
    public final boolean V() {
        byte b = this.a;
        return false;
    }

    @Override // defpackage.l24
    public final boolean Z() {
        byte b = this.a;
        return false;
    }

    @Override // defpackage.l24
    public final boolean j() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((ie) obj).a.b();
            case 1:
                return false;
            case 2:
                return ((bk5) obj).b(xle.e);
            case 3:
                return ((akg) obj).b();
            default:
                return ((h0h) obj).b();
        }
    }

    @Override // defpackage.l24
    public final boolean u() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((ie) obj).a.b();
            case 1:
                ((AutofillPasswordPickerActivity) obj).getSupportFragmentManager().X();
                return true;
            case 2:
                return ((bk5) obj).b(xle.e);
            case 3:
                return ((akg) obj).b();
            default:
                return ((h0h) obj).b();
        }
    }
}
