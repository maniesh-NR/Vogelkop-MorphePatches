package defpackage;

/* loaded from: classes.dex */
public final class m64 implements k64 {
    public final /* synthetic */ byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(hfi hfiVar) {
        switch (this.a) {
            case 0:
                if ((hfiVar instanceof ffi) && ((ffi) hfiVar).h().size() != 0) {
                    break;
                }
                break;
            case 1:
                if (hfiVar.b != null) {
                    break;
                }
                break;
        }
        return false;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "empty";
            case 1:
                return "root";
            default:
                return "target";
        }
    }
}
