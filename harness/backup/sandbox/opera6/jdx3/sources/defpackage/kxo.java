package defpackage;

/* loaded from: classes.dex */
public final class kxo extends boo {
    public final /* synthetic */ byte b;

    public /* synthetic */ kxo(byte b) {
        this.b = b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bf, code lost:
    
        if (java.lang.Character.isValidCodePoint(r7) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f0, code lost:
    
        if (java.lang.Character.isValidCodePoint(r7) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012a, code lost:
    
        if (java.lang.Character.isValidCodePoint(r7) == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:?, code lost:
    
        return java.lang.Character.valueOf((char) r7);
     */
    @Override // defpackage.boo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.sj2 r8) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kxo.a(sj2):java.lang.Object");
    }

    public final Character c(sj2 sj2Var) throws NumberFormatException {
        Character chL;
        Character chL2;
        sj2Var.a();
        abp abpVar = (abp) sj2Var;
        Character chL3 = abpVar.l();
        if (chL3 == null || chL3.charValue() != '\\' || (chL = abpVar.l()) == null) {
            sj2Var.h();
            return null;
        }
        char cCharValue = chL.charValue();
        if (cCharValue != 0 && cCharValue != '\n' && cCharValue != '\f') {
            if (cCharValue != '\r') {
                if (!abp.j(chL)) {
                    return chL;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(chL);
                int i = 0;
                while (true) {
                    if (i < 5 && (chL2 = abpVar.l()) != null && !Character.isWhitespace(chL2.charValue())) {
                        if (!abp.j(chL2)) {
                            sj2Var.d = chL2;
                            break;
                        }
                        sb.append(chL2);
                        i++;
                    }
                }
                try {
                    int i2 = Integer.parseInt(sb.toString(), 16);
                    if (Character.isValidCodePoint(i2)) {
                        return Character.valueOf((char) i2);
                    }
                    return (char) 65533;
                } catch (NumberFormatException e) {
                    h9o.m("Received a NumberFormateException parsing a string verified to be hex", e);
                    return null;
                }
            }
            if (sj2Var.b('\n')) {
                abpVar.l();
            }
        }
        return c(sj2Var);
    }
}
