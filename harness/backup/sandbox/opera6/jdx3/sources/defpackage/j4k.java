package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import android.widget.Toast;
import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public final /* synthetic */ class j4k implements View.OnLongClickListener {
    public final /* synthetic */ byte a;

    public /* synthetic */ j4k(byte b) {
        this.a = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 1:
                ((ClipboardManager) view.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("id", ((OperaListItem) view).B.D()));
                Toast.makeText(view.getContext(), "Copied to clipboard", 1).show();
                break;
        }
        return true;
    }
}
