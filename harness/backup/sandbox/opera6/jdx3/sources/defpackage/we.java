package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class we extends d43 {
    public final TextView e;
    public MenuItem f;

    public we(TextView textView, int i) {
        super(textView.getContext(), new mc8((byte) 20), i);
        this.e = textView;
    }

    @Override // defpackage.d43
    public final String b() {
        TextView textView = this.e;
        String string = textView.getText().toString();
        int selectionStart = textView.getSelectionStart();
        int selectionEnd = textView.getSelectionEnd();
        return (selectionStart < 0 || selectionEnd < 0) ? "" : string.substring(Math.min(selectionStart, selectionEnd), Math.max(selectionStart, selectionEnd));
    }

    @Override // defpackage.d43, android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        if (!super.onActionItemClicked(actionMode, menuItem)) {
            if (menuItem != this.f && menuItem.getItemId() != 2131364202) {
                if (menuItem.getItemId() != 16908341) {
                    return false;
                }
                TextView textView = this.e;
                q9n.u(textView);
                new ghf(new i4d(new u5f(b(), (byte) 11))).I(textView.getContext());
                return true;
            }
            String strB = b();
            xe xeVar = ye.a;
            if (!TextUtils.isEmpty(xih.r(1000, strB))) {
                throw null;
            }
        }
        return true;
    }

    @Override // defpackage.d43, android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        super.onDestroyActionMode(actionMode);
        this.f = null;
    }

    @Override // defpackage.d43, android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) throws Resources.NotFoundException {
        ComponentName component;
        String string = this.e.getResources().getString(2132021000);
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= menu.size()) {
                break;
            }
            MenuItem item = menu.getItem(i2);
            Intent intent = item.getIntent();
            if (intent == null ? false : "android.intent.action.PROCESS_TEXT".equals(intent.getAction())) {
                if (i == -1) {
                    i = i2;
                }
                Intent intent2 = item.getIntent();
                if ((intent2 == null || (component = intent2.getComponent()) == null) ? false : this.b.equals(component.getPackageName())) {
                    item.setTitle(string);
                    break;
                }
            }
            i2++;
        }
        super.onPrepareActionMode(actionMode, menu);
        return true;
    }
}
