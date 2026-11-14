package defpackage;

import android.view.KeyEvent;
import java.util.Locale;

/* loaded from: classes.dex */
public final class vvb {
    public final uvb[] a;

    public vvb(uvb[] uvbVarArr) {
        this.a = uvbVarArr;
    }

    public final dnb a(KeyEvent keyEvent) {
        for (uvb uvbVar : this.a) {
            if (uvbVar.d.a() && fr3.H(uvbVar.b, keyEvent) && keyEvent.getKeyCode() == uvbVar.c) {
                return new dnb(uvbVar.d, (byte) 4);
            }
        }
        return null;
    }

    public final String b(int i) {
        String strValueOf;
        if (i != 0) {
            uvb[] uvbVarArr = this.a;
            int length = uvbVarArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                uvb uvbVar = uvbVarArr[i2];
                if (uvbVar.d.a() && uvbVar.a == i) {
                    byte b = uvbVar.b;
                    byte b2 = uvbVar.c;
                    if (b2 < 7 || b2 > 16) {
                        strValueOf = (b2 < 29 || b2 > 54) ? null : String.format(Locale.US, "%c", Integer.valueOf(b2 + 36));
                    } else {
                        Locale locale = Locale.US;
                        strValueOf = String.valueOf(b2 - 7);
                    }
                    if (strValueOf != null) {
                        StringBuilder sb = new StringBuilder();
                        if ((b & 2) != 0) {
                            fr3.h(sb, "Ctrl");
                        }
                        if ((b & 1) != 0) {
                            fr3.h(sb, "Alt");
                        }
                        if ((b & 4) != 0) {
                            fr3.h(sb, "Shift");
                        }
                        fr3.h(sb, strValueOf);
                        return sb.toString();
                    }
                } else {
                    i2++;
                }
            }
        }
        return null;
    }
}
