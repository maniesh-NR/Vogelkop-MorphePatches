package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.view.MenuItem;
import android.view.textclassifier.TextClassification;
import androidx.fragment.app.r;
import com.opera.android.OperaApplication;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class bb1 implements MenuItem.OnMenuItemClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bb1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((sfl) obj2).d.invoke(((cb1) obj).a);
                break;
            case 1:
                nrf nrfVar = (nrf) obj2;
                r activity = nrfVar.getActivity();
                String[] strArr = OperaApplication.K;
                ((OperaApplication) activity.getApplication()).J().V(((lrf) ((List) obj).get(menuItem.getItemId())).getValue(), nrfVar.i);
                break;
            default:
                Context context = (Context) obj2;
                TextClassification textClassification = (TextClassification) obj;
                String text = textClassification.getText();
                PendingIntent activity2 = PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
                if (Build.VERSION.SDK_INT < 34) {
                    activity2.send();
                    break;
                } else {
                    g8.K(activity2);
                    break;
                }
        }
        return true;
    }
}
