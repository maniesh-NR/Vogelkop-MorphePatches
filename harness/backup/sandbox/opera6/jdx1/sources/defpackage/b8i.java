package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class b8i extends OrientationEventListener {
    public int a;
    public final /* synthetic */ ghf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8i(ghf ghfVar, Context context) {
        super(context);
        this.b = ghfVar;
        this.a = -1;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        ArrayList arrayList;
        if (i != -1) {
            int i2 = 0;
            int i3 = (i >= 315 || i < 45) ? 0 : i >= 225 ? 1 : i >= 135 ? 2 : 3;
            if (this.a != i3) {
                this.a = i3;
                synchronized (this.b.b) {
                    arrayList = new ArrayList(((HashMap) this.b.d).values());
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    d8i d8iVar = (d8i) obj;
                    d8iVar.b.execute(new oc4(d8iVar, i3, (byte) 5));
                }
            }
        }
    }
}
