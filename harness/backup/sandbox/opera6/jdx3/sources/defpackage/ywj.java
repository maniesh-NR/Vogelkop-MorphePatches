package defpackage;

import android.text.Editable;
import android.text.style.BackgroundColorSpan;
import com.opera.android.widget.UrlFieldEditText;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class ywj {
    public static final Pattern o = Pattern.compile("[\\p{script=latin}\\p{script=cyrillic}\\p{script=greek}\\p{script=hebrew}\\p{Punct} 0-9]*");
    public final UrlFieldEditText a;
    public final x5f b;
    public final ip2 c;
    public final ip2 d;
    public final ip2 e;
    public final rgh f;
    public xwj g;
    public int j;
    public int k;
    public int l;
    public int m;
    public boolean h = true;
    public boolean i = true;
    public boolean n = true;

    /* JADX WARN: Multi-variable type inference failed */
    public ywj(UrlFieldEditText urlFieldEditText, x5f x5fVar) {
        this.a = urlFieldEditText;
        this.b = x5fVar;
        Editable text = urlFieldEditText.getText();
        int selectionStart = urlFieldEditText.getSelectionStart();
        int selectionEnd = urlFieldEditText.getSelectionEnd();
        ip2 ip2Var = new ip2();
        ip2Var.f(selectionStart, selectionEnd, text, "");
        this.c = ip2Var;
        ip2 ip2Var2 = new ip2();
        ip2Var2.a(ip2Var);
        this.d = ip2Var2;
        ip2 ip2Var3 = new ip2();
        ip2Var3.a(ip2Var);
        this.e = ip2Var3;
        rgh rghVar = new rgh();
        rghVar.a = urlFieldEditText;
        this.f = rghVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ywj.a():void");
    }

    public final void b(int i, int i2) {
        ip2 ip2Var = this.c;
        if (ip2Var.c == i && ip2Var.d == i2) {
            return;
        }
        ip2Var.c = i;
        ip2Var.d = i2;
        if (this.j > 0) {
            return;
        }
        int length = ip2Var.a.length();
        if (ip2Var.c()) {
            if (i > length || i2 > length) {
                xwj xwjVar = this.g;
                if (xwjVar != null) {
                    xwjVar.a();
                }
            } else {
                this.e.b = "";
                ip2Var.b = "";
                xwj xwjVar2 = this.g;
                if (xwjVar2 != null) {
                    xwjVar2.d();
                    this.g.e();
                } else {
                    this.f.s();
                    a();
                }
            }
        }
        e();
        a();
    }

    public final void c(CharSequence charSequence) {
        BackgroundColorSpan backgroundColorSpan;
        int length = charSequence.length();
        int length2 = charSequence.length();
        ip2 ip2Var = this.c;
        ip2Var.f(length, length2, charSequence, "");
        rgh rghVar = this.f;
        bq1 bq1Var = (UrlFieldEditText) rghVar.a;
        if (bq1Var.isFocused()) {
            bq1Var.setCursorVisible(true);
        }
        Editable editableText = bq1Var.getEditableText();
        if (((editableText == null || (backgroundColorSpan = (BackgroundColorSpan) rghVar.b) == null) ? -1 : editableText.getSpanStart(backgroundColorSpan)) != -1) {
            editableText.removeSpan((BackgroundColorSpan) rghVar.b);
        }
        rghVar.b = null;
        this.d.a(ip2Var);
        this.e.a(ip2Var);
        if (this.j == 0) {
            e();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0033 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.CharSequence r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof android.text.Editable
            r1 = 0
            rgh r2 = r6.f
            ip2 r3 = r6.c
            if (r0 == 0) goto L33
            r0 = r7
            android.text.Editable r0 = (android.text.Editable) r0
            java.lang.Object r4 = r2.b
            android.text.style.BackgroundColorSpan r4 = (android.text.style.BackgroundColorSpan) r4
            r5 = -1
            if (r4 != 0) goto L15
            r4 = r5
            goto L19
        L15:
            int r4 = r0.getSpanStart(r4)
        L19:
            if (r4 == r5) goto L33
            java.lang.CharSequence r7 = r0.subSequence(r1, r4)
            android.text.SpannableString r0 = new android.text.SpannableString     // Catch: java.lang.IndexOutOfBoundsException -> L27
            r0.<init>(r7)     // Catch: java.lang.IndexOutOfBoundsException -> L27
            r3.a = r0     // Catch: java.lang.IndexOutOfBoundsException -> L27
            goto L46
        L27:
            android.text.SpannableString r0 = new android.text.SpannableString
            java.lang.String r7 = r7.toString()
            r0.<init>(r7)
            r3.a = r0
            goto L46
        L33:
            android.text.SpannableString r0 = new android.text.SpannableString     // Catch: java.lang.IndexOutOfBoundsException -> L3b
            r0.<init>(r7)     // Catch: java.lang.IndexOutOfBoundsException -> L3b
            r3.a = r0     // Catch: java.lang.IndexOutOfBoundsException -> L3b
            goto L46
        L3b:
            android.text.SpannableString r0 = new android.text.SpannableString
            java.lang.String r7 = r7.toString()
            r0.<init>(r7)
            r3.a = r0
        L46:
            int r7 = r6.j
            if (r7 > 0) goto L67
            r6.h = r1
            ip2 r7 = r6.e
            java.lang.String r0 = ""
            r7.b = r0
            r3.b = r0
            xwj r7 = r6.g
            if (r7 == 0) goto L61
            r7.d()
            xwj r6 = r6.g
            r6.e()
            goto L67
        L61:
            r2.s()
            r6.a()
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ywj.d(java.lang.CharSequence):void");
    }

    public final void e() {
        bq1 bq1Var = this.a;
        int selectionStart = bq1Var.getSelectionStart();
        int selectionEnd = bq1Var.getSelectionEnd();
        if (selectionStart == this.l && selectionEnd == this.m) {
            return;
        }
        this.l = selectionStart;
        this.m = selectionEnd;
    }
}
