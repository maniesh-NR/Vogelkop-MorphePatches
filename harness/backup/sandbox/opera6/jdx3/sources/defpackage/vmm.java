package defpackage;

/* loaded from: classes.dex */
public final class vmm extends s1g {
    public final h1b c;

    public vmm(String str, csh cshVar) {
        super(str, (Exception) null, false, 1);
        this.c = h1b.s(cshVar);
    }

    public final String getMessage() {
        String message = super.getMessage();
        h1b h1bVar = this.c;
        if (h1bVar.isEmpty()) {
            return message;
        }
        return message + "\nsniff failures: " + h1bVar;
    }
}
