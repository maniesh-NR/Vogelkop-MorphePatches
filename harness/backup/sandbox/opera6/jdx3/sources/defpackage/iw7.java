package defpackage;

import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.i;
import com.opera.android.feed.FeedScrollView;

/* loaded from: classes.dex */
public final class iw7 implements sj7 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ hzj c;

    public /* synthetic */ iw7(hzj hzjVar, byte b) {
        this.a = b;
        this.c = hzjVar;
    }

    @Override // defpackage.sj7
    public final void c(i iVar) {
        byte b = this.a;
        hzj hzjVar = this.c;
        switch (b) {
            case 0:
                FeedScrollView feedScrollView = ((ow7) hzjVar).d;
                this.b = ((NestedScrollView) feedScrollView).x.b;
                feedScrollView.setNestedScrollingEnabled(false);
                break;
            default:
                kok kokVar = (kok) hzjVar;
                FeedScrollView feedScrollView2 = kokVar.b;
                this.b = ((NestedScrollView) feedScrollView2).x.b;
                feedScrollView2.setNestedScrollingEnabled(false);
                kokVar.l.getClass();
                break;
        }
    }

    @Override // defpackage.sj7
    public final void o(i iVar) {
        byte b = this.a;
        hzj hzjVar = this.c;
        switch (b) {
            case 0:
                ((ow7) hzjVar).d.setNestedScrollingEnabled(this.b);
                break;
            default:
                kok kokVar = (kok) hzjVar;
                kokVar.l.getClass();
                kokVar.b.setNestedScrollingEnabled(this.b);
                break;
        }
    }
}
