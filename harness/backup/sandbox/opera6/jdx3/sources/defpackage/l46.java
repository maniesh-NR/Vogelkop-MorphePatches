package defpackage;

import android.database.DataSetObserver;
import androidx.appcompat.widget.ListPopupWindow;
import com.google.android.material.tabs.TabLayout;
import com.opera.android.undo.UndoBar;

/* loaded from: classes.dex */
public final class l46 extends DataSetObserver {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l46(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                tqk tqkVar = (tqk) obj;
                ((m46) tqkVar).a = true;
                tqkVar.notifyDataSetChanged();
                break;
            case 1:
                h2c.a((h2c) obj);
                break;
            case 2:
                ListPopupWindow listPopupWindow = (ListPopupWindow) obj;
                if (listPopupWindow.B.isShowing()) {
                    listPopupWindow.show();
                    break;
                }
                break;
            case 3:
                super.onChanged();
                ((wwf) obj).a.m();
                break;
            case 4:
                ((TabLayout) obj).f();
                break;
            default:
                super.onChanged();
                UndoBar undoBar = (UndoBar) obj;
                if (!undoBar.g) {
                    if (!undoBar.j) {
                        undoBar.a(false);
                        break;
                    } else if (!undoBar.k) {
                        undoBar.k = true;
                        vml.c(new cbl((Object) this, (byte) 28));
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                tqk tqkVar = (tqk) obj;
                ((m46) tqkVar).a = false;
                tqkVar.notifyDataSetInvalidated();
                break;
            case 1:
            case 3:
            default:
                super.onInvalidated();
                break;
            case 2:
                ((ListPopupWindow) obj).dismiss();
                break;
            case 4:
                ((TabLayout) obj).f();
                break;
        }
    }
}
