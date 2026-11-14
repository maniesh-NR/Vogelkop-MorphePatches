package defpackage;

/* loaded from: classes.dex */
public final class h7b implements fji {
    public final /* synthetic */ byte a;
    public final String b;
    public long c;

    public h7b(String str) {
        this.a = (byte) 2;
        this.b = str;
        this.c = 0L;
    }

    public /* synthetic */ h7b(String str, long j, byte b) {
        this.a = b;
        this.b = str;
        this.c = j;
    }

    @Override // defpackage.fji
    public final long b() {
        switch (this.a) {
        }
        return this.c;
    }

    @Override // defpackage.fji
    public final String c() {
        switch (this.a) {
            case 1:
                return "application/pdf";
            default:
                return "image/png";
        }
    }

    @Override // defpackage.fji
    public final String d() {
        switch (this.a) {
        }
        return getFileName();
    }

    @Override // defpackage.fji
    public final String getFileName() {
        byte b = this.a;
        String strSubstring = this.b;
        switch (b) {
            case 1:
                if (strSubstring.length() > 64) {
                    strSubstring = strSubstring.substring(0, 64);
                }
                return ((Object) lg7.f(strSubstring)) + ".pdf";
            default:
                return ((Object) lg7.f(strSubstring)) + ".png";
        }
    }

    @Override // defpackage.fji
    public final boolean i() {
        switch (this.a) {
            case 1:
                if (this.c > 0) {
                }
                break;
            default:
                if (this.c > 0) {
                }
                break;
        }
        return false;
    }
}
