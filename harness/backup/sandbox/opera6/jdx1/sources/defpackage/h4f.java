package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import org.w3c.dom.DOMException;

/* loaded from: classes.dex */
public class h4f implements InputConnection {
    public final nna a;
    public toh b;

    public h4f(toh tohVar, nna nnaVar) {
        this.a = nnaVar;
        this.b = tohVar;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        toh tohVar = this.b;
        if (tohVar != null) {
            return tohVar.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        toh tohVar = this.b;
        if (tohVar != null) {
            return tohVar.clearMetaKeyStates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() throws DOMException, NumberFormatException {
        toh tohVar = this.b;
        if (tohVar != null) {
            if (tohVar != null) {
                tohVar.closeConnection();
                this.b = null;
            }
            this.a.invoke(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        toh tohVar = this.b;
        if (tohVar != null) {
            return tohVar.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        toh tohVar = this.b;
        if (tohVar != null) {
            return tohVar.commitContent(inputContentInfo, i, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        toh tohVar = this.b;
        if (tohVar != null) {
            return tohVar.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        toh tohVar = this.b;
        if (tohVar != null) {
            return tohVar.commitText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        toh tohVar = this.b;
        if (tohVar != null) {
            return tohVar.deleteSurroundingText(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        toh tohVar = this.b;
        if (tohVar != null) {
            return tohVar.deleteSurroundingTextInCodePoints(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        toh tohVar = this.b;
        if (tohVar != null) {
            return tohVar.b();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        toh tohVar = this.b;
        if (tohVar != null) {
            return tohVar.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        toh tohVar = this.b;
        if (tohVar != null) {
            return tohVar.getCursorCapsMode(i);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        toh tohVar = this.b;
        if (tohVar != null) {
            return tohVar.getExtractedText(extractedTextRequest, i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        toh tohVar = this.b;
        if (tohVar != null) {
            return tohVar.getSelectedText(i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        toh tohVar = this.b;
        if (tohVar != null) {
            return tohVar.getTextAfterCursor(i, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        toh tohVar = this.b;
        if (tohVar != null) {
            return tohVar.getTextBeforeCursor(i, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        toh tohVar = this.b;
        if (tohVar != null) {
            return tohVar.performContextMenuAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        toh tohVar = this.b;
        if (tohVar != null) {
            return tohVar.performEditorAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        toh tohVar = this.b;
        if (tohVar != null) {
            return tohVar.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        toh tohVar = this.b;
        if (tohVar != null) {
            return tohVar.requestCursorUpdates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        toh tohVar = this.b;
        if (tohVar != null) {
            return tohVar.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        toh tohVar = this.b;
        if (tohVar != null) {
            return tohVar.setComposingRegion(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        toh tohVar = this.b;
        if (tohVar != null) {
            return tohVar.setComposingText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        toh tohVar = this.b;
        if (tohVar != null) {
            return tohVar.setSelection(i, i2);
        }
        return false;
    }
}
