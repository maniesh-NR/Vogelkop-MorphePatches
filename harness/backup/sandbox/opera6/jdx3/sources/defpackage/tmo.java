package defpackage;

/* loaded from: classes.dex */
public final class tmo extends i7c {
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tmo(Object obj, byte b) {
        super((byte) 1);
        this.d = b;
        this.e = obj;
    }

    @Override // defpackage.i7c
    public final Object c() {
        int i;
        String strK;
        StringBuilder sb;
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                f1p f1pVarA = f1p.a();
                String str = (String) obj;
                if (str == null) {
                    f1pVarA.getClass();
                    return null;
                }
                b6p b6pVar = (b6p) f1pVarA.b;
                char[] cArr = f1p.d;
                StringBuilder sb2 = new StringBuilder();
                int iCharCount = 0;
                while (iCharCount < str.length()) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (Character.isValidCodePoint(iCodePointAt)) {
                        char c = (char) iCodePointAt;
                        int i2 = 0;
                        while (true) {
                            if (i2 < 5) {
                                if (c != cArr[i2]) {
                                    i2++;
                                } else if (Character.isValidCodePoint(iCodePointAt)) {
                                    sb = new StringBuilder();
                                }
                            }
                        }
                        String hexString = iCodePointAt < 255 ? b6pVar.a[iCodePointAt] : Integer.toHexString(iCodePointAt);
                        if (hexString == null && Character.isValidCodePoint(iCodePointAt)) {
                            sb = new StringBuilder();
                            strK = sb.appendCodePoint(iCodePointAt).toString();
                            sb2.append(strK);
                        } else {
                            if ((iCodePointAt > 31 || iCodePointAt == 9 || iCodePointAt == 10 || iCodePointAt == 13) && (iCodePointAt < 127 || iCodePointAt > 159)) {
                                i = iCodePointAt;
                            } else {
                                hexString = "fffd";
                                i = 65533;
                            }
                            String str2 = (String) b6p.b.get(Integer.valueOf(i));
                            strK = str2 != null ? sko.k("&", str2, ";") : sko.k("&#x", hexString, ";");
                            sb2.append(strK);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt);
                }
                return sb2.toString();
            default:
                f1p f1pVarA2 = f1p.a();
                String str3 = (String) ((tmo) ((lxo) obj).q.a).a();
                if (str3 != null) {
                    return ((b6p) f1pVarA2.b).b(str3);
                }
                f1pVarA2.getClass();
                return null;
        }
    }
}
