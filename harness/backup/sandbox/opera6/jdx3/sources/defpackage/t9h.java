package defpackage;

/* loaded from: classes.dex */
public final class t9h implements CharSequence {
    public final csh a;
    public final int b;
    public final int c = 8191;

    public t9h(csh cshVar) {
        this.a = cshVar;
        int length = 0;
        a1b a1bVarU = cshVar.u(0);
        while (a1bVarU.hasNext()) {
            length += ((CharSequence) a1bVarU.next()).length();
        }
        this.b = length;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return ((CharSequence) this.a.get(i >> 13)).charAt(i & this.c);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.b;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        StringBuilder sb = new StringBuilder(this.b);
        a1b a1bVarU = this.a.u(0);
        while (a1bVarU.hasNext()) {
            sb.append((CharSequence) a1bVarU.next());
        }
        return sb.toString();
    }
}
