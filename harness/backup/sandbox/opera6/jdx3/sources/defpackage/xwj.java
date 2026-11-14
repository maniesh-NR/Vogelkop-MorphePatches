package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.Editable;
import android.text.Selection;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import com.opera.android.widget.UrlFieldEditText;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public final class xwj extends InputConnectionWrapper {
    public final ip2 a;
    public long b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ ywj e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xwj(ywj ywjVar) {
        super(null, true);
        Objects.requireNonNull(ywjVar);
        this.e = ywjVar;
        ip2 ip2Var = ywjVar.c;
        ip2 ip2Var2 = new ip2();
        ip2Var2.a(ip2Var);
        this.a = ip2Var2;
    }

    public final void a() {
        ywj ywjVar = this.e;
        ip2 ip2Var = ywjVar.c;
        ip2 ip2Var2 = ywjVar.c;
        if (ip2Var.c()) {
            CharSequence charSequence = ip2Var2.b;
            ip2Var2.a = TextUtils.concat(ip2Var2.a, charSequence);
            ip2Var2.b = "";
            ywjVar.e.a(ip2Var2);
            ywjVar.h = false;
            if (ywjVar.j != 0) {
                ywjVar.a.append(charSequence);
                return;
            }
            c();
            super.finishComposingText();
            rgh rghVar = ywjVar.f;
            bq1 bq1Var = (UrlFieldEditText) rghVar.a;
            bq1Var.getEditableText().removeSpan((BackgroundColorSpan) rghVar.b);
            if (bq1Var.isFocused()) {
                bq1Var.setCursorVisible(true);
            }
            b();
        }
    }

    public final boolean b() {
        ywj ywjVar = this.e;
        int i = ywjVar.j;
        x5f x5fVar = ywjVar.b;
        ywjVar.j = i - 1;
        boolean zEndBatchEdit = super.endBatchEdit();
        if (ywjVar.j == 0) {
            ywjVar.e();
            if (!this.c && x5fVar != null) {
                long jUptimeMillis = SystemClock.uptimeMillis() - this.b;
                if (jUptimeMillis > 200) {
                    this.c = true;
                    Locale locale = Locale.US;
                    x5fVar.R(25, z1m.j(jUptimeMillis / 1000, "batch edit time: <", "s"));
                }
            }
        }
        if (!this.d && x5fVar != null && ywjVar.j < 0) {
            this.d = true;
            x5fVar.R(26, null);
        }
        return zEndBatchEdit;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        d();
        c();
        return e();
    }

    public final boolean c() {
        ywj ywjVar = this.e;
        if (ywjVar.j == 0) {
            this.b = SystemClock.uptimeMillis();
        }
        ywjVar.j++;
        return super.beginBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        d();
        boolean zClearMetaKeyStates = super.clearMetaKeyStates(i);
        e();
        return zClearMetaKeyStates;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        d();
        boolean zCommitCompletion = super.commitCompletion(completionInfo);
        e();
        return zCommitCompletion;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        d();
        boolean zCommitContent = super.commitContent(inputContentInfo, i, bundle);
        e();
        return zCommitContent;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        d();
        boolean zCommitCorrection = super.commitCorrection(correctionInfo);
        e();
        return zCommitCorrection;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        d();
        boolean zCommitText = super.commitText(charSequence, i);
        e();
        return zCommitText;
    }

    public final void d() {
        c();
        ywj ywjVar = this.e;
        int i = ywjVar.j;
        bq1 bq1Var = ywjVar.a;
        if (i == 1) {
            this.a.a(ywjVar.c);
        } else if (ywjVar.k > 0) {
            int length = bq1Var.getText().length();
            bq1Var.getText().delete(length - ywjVar.k, length);
        }
        ywjVar.k = 0;
        ywjVar.f.s();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        d();
        boolean zDeleteSurroundingText = super.deleteSurroundingText(i, i2);
        e();
        return zDeleteSurroundingText;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        d();
        boolean zDeleteSurroundingTextInCodePoints = super.deleteSurroundingTextInCodePoints(i, i2);
        e();
        return zDeleteSurroundingTextInCodePoints;
    }

    public final boolean e() {
        int length;
        ywj ywjVar = this.e;
        ip2 ip2Var = ywjVar.c;
        rgh rghVar = ywjVar.f;
        ip2 ip2Var2 = ywjVar.e;
        ip2 ip2Var3 = ywjVar.c;
        boolean zD = ip2Var.d();
        ip2 ip2Var4 = this.a;
        CharSequence charSequenceSubSequence = (zD && ip2Var4.d() && ip2.e(ip2Var.a, ip2Var4.a)) ? ip2Var4.a.subSequence(ip2Var.a.length(), ip2Var4.a.length()) : null;
        if (charSequenceSubSequence != null) {
            boolean zB = b();
            if (ip2Var4.c()) {
                int i = ywjVar.j;
                bq1 bq1Var = ywjVar.a;
                if (i > 0) {
                    ywjVar.k = charSequenceSubSequence.length();
                }
                if (ywjVar.j == 0) {
                    String string = Settings.Secure.getString(bq1Var.getContext().getContentResolver(), "default_input_method");
                    if (string == null) {
                        string = "";
                    }
                    if (!string.contains("com.sec.android.inputmethod") && !string.contains("com.lge.ime")) {
                        super.finishComposingText();
                    }
                }
                c();
                bq1Var.getEditableText().append(charSequenceSubSequence);
                b();
            }
            ywjVar.h = false;
            ip2Var2.b = "";
            ip2Var3.b = "";
            ywjVar.a();
            return zB;
        }
        rghVar.s();
        if (ip2Var3.d() && (length = ip2Var3.a.length() - ip2Var2.a.length()) >= 0 && ip2.e(ip2Var3.a, ip2Var2.b())) {
            CharSequence charSequence = ip2Var2.b;
            ip2Var3.b = charSequence.subSequence(length, charSequence.length());
            bq1 bq1Var2 = (UrlFieldEditText) rghVar.a;
            int i2 = ip2Var3.c;
            if (((BackgroundColorSpan) rghVar.b) == null) {
                rghVar.b = new BackgroundColorSpan(bq1Var2.getHighlightColor());
            }
            SpannableString spannableString = new SpannableString(ip2Var3.b);
            spannableString.setSpan((BackgroundColorSpan) rghVar.b, 0, ip2Var3.b.length(), 33);
            Editable editableText = bq1Var2.getEditableText();
            editableText.append((CharSequence) spannableString);
            Selection.setSelection(editableText, i2, i2);
            if (bq1Var2.isFocused()) {
                bq1Var2.setCursorVisible(false);
            }
        } else {
            ip2Var2.b = "";
            ip2Var3.b = "";
        }
        boolean zB2 = b();
        if ((ip2Var3.d() && ip2Var4.d() && ip2.e(ip2Var4.a, ip2Var3.a)) || (ip2Var4.c == 0 && ip2Var4.d == ip2Var4.a.length() && ip2Var3.a.length() > 0 && ip2Var3.d())) {
            ywjVar.h = true;
        }
        ywjVar.a();
        return zB2;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        d();
        b();
        return e();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        d();
        boolean zFinishComposingText = super.finishComposingText();
        e();
        return zFinishComposingText;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        d();
        int cursorCapsMode = super.getCursorCapsMode(i);
        e();
        return cursorCapsMode;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        d();
        ExtractedText extractedText = super.getExtractedText(extractedTextRequest, i);
        e();
        return extractedText;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        d();
        CharSequence selectedText = super.getSelectedText(i);
        e();
        return selectedText;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        d();
        CharSequence textAfterCursor = super.getTextAfterCursor(i, i2);
        e();
        return textAfterCursor;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        d();
        CharSequence textBeforeCursor = super.getTextBeforeCursor(i, i2);
        e();
        return textBeforeCursor;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        d();
        a();
        boolean zPerformEditorAction = super.performEditorAction(i);
        e();
        return zPerformEditorAction;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        d();
        boolean zRequestCursorUpdates = super.requestCursorUpdates(i);
        e();
        return zRequestCursorUpdates;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        d();
        boolean zSendKeyEvent = super.sendKeyEvent(keyEvent);
        e();
        return zSendKeyEvent;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        d();
        boolean composingRegion = super.setComposingRegion(i, i2);
        e();
        return composingRegion;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        d();
        boolean composingText = super.setComposingText(charSequence, i);
        e();
        return composingText;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        d();
        boolean selection = super.setSelection(i, i2);
        e();
        return selection;
    }
}
