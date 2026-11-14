package defpackage;

import android.view.View;
import com.opera.android.custom_views.RadioButton;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class pih implements p9n {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Object b;

    public pih(RadioButton radioButton, RadioButton radioButton2) {
        this.b = radioButton2;
    }

    public pih(ArrayList arrayList) {
        this.b = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p9n
    public final void h(View view) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                RadioButton radioButton = (RadioButton) view;
                if (radioButton != ((RadioButton) obj)) {
                    radioButton.setChecked(false);
                    break;
                }
                break;
            default:
                ((ArrayList) obj).add(view);
                break;
        }
    }
}
