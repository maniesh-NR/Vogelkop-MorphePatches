package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import android.widget.Toast;
import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public final class kel implements View.OnLongClickListener {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        ((ClipboardManager) view.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("tokenHeader", ((OperaListItem) view).B.D()));
        Toast.makeText(view.getContext(), "Copied to clipboard", 1).show();
        return true;
    }
}
