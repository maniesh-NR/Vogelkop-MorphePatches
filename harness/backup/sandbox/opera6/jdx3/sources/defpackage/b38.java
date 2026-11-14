package defpackage;

import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.StylingImageButton;

/* loaded from: classes.dex */
public final class b38 extends i implements pkb {
    public static final /* synthetic */ int d = 0;
    public final ypd b;
    public int c;

    /* JADX WARN: Multi-variable type inference failed */
    public b38(StylingImageButton stylingImageButton, ypd ypdVar) {
        super(stylingImageButton);
        this.b = ypdVar;
        ((i) this).itemView.setOnClickListener(new yk4((Object) this, (byte) 20));
    }

    @Override // defpackage.pkb
    public final int getGroupId() {
        return this.c;
    }
}
