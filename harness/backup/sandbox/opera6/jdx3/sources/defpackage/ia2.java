package defpackage;

/* loaded from: classes.dex */
public abstract class ia2 extends ja2 {
    public final /* synthetic */ byte b;

    public boolean equals(Object obj) {
        switch (this.b) {
            case 0:
                if (obj == null) {
                    return false;
                }
                return getClass().equals(obj.getClass());
            default:
                return super.equals(obj);
        }
    }

    public int hashCode() {
        switch (this.b) {
            case 0:
                return getClass().hashCode();
            default:
                return super.hashCode();
        }
    }
}
