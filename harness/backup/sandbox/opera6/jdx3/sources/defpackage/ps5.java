package defpackage;

import android.graphics.drawable.Drawable;
import android.view.ContextMenu;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class ps5 extends bud implements ContextMenu {
    public CharSequence d;
    public eog e;

    @Override // android.view.ContextMenu
    public final void clearHeader() {
        this.d = "";
        e();
    }

    public final void e() {
        eog eogVar = this.e;
        if (eogVar != null) {
            CharSequence charSequence = this.d;
            if (eogVar.f != null) {
                if (charSequence == null || charSequence.length() == 0) {
                    eogVar.f.findViewById(2131363466).setVisibility(8);
                } else {
                    eogVar.f.findViewById(2131363466).setVisibility(0);
                    ((TextView) eogVar.f.findViewById(2131363468)).setText(charSequence);
                }
            }
        }
    }

    @Override // android.view.ContextMenu
    public final ContextMenu setHeaderIcon(int i) {
        return this;
    }

    @Override // android.view.ContextMenu
    public final ContextMenu setHeaderIcon(Drawable drawable) {
        return this;
    }

    @Override // android.view.ContextMenu
    public final ContextMenu setHeaderTitle(int i) {
        this.d = this.a.getResources().getString(i);
        e();
        return this;
    }

    @Override // android.view.ContextMenu
    public final ContextMenu setHeaderTitle(CharSequence charSequence) {
        this.d = charSequence;
        e();
        return this;
    }

    @Override // android.view.ContextMenu
    public final ContextMenu setHeaderView(View view) {
        return this;
    }
}
