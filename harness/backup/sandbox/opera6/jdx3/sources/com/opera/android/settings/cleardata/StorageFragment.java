package com.opera.android.settings.cleardata;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.r;
import com.opera.android.settings.cleardata.StorageFragment;
import defpackage.a3j;
import defpackage.itl;
import defpackage.ltl;
import defpackage.pjm;
import defpackage.u7k;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class StorageFragment extends ltl {
    /* JADX WARN: Illegal instructions before constructor call */
    public StorageFragment() {
        u7k u7kVarF = u7k.f(fki.a);
        u7kVarF.s(2132021648);
        super((itl) u7kVarF.a);
    }

    @Override // defpackage.k24
    public final void l0(boolean z) {
        getActivity().finish();
    }

    @Override // defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (pjm.a) {
            WeakHashMap weakHashMap = r5n.a;
            h5n.c((View) m5n.f(view, 2131362059), new a3j((byte) 14));
        }
    }

    @Override // defpackage.ltl
    public final void v0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(2131559315, viewGroup);
        ((TextView) viewInflate.findViewById(2131362727)).setText(getString(2132021209, new Object[]{getString(2132017591)}));
        final byte b = 0;
        viewInflate.findViewById(2131363389).setOnClickListener(new View.OnClickListener(this) { // from class: idk
            public final /* synthetic */ StorageFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                StorageFragment storageFragment = this.b;
                switch (b2) {
                    case 0:
                        r activity = storageFragment.getActivity();
                        Intent intentB = mdb.b(activity);
                        intentB.setAction("com.opera.android.action.SHOW_MANAGE_SPACE");
                        activity.startActivity(intentB);
                        break;
                    default:
                        az0 az0Var = new az0(storageFragment.getContext());
                        az0Var.b(2132021208);
                        az0Var.a(2132021207);
                        az0Var.setPositiveButton(2132021206, new sk(storageFragment, (byte) 12));
                        az0Var.setNegativeButton(2132018111, (DialogInterface.OnClickListener) null);
                        az0Var.c();
                        break;
                }
            }
        });
        final byte b2 = 1;
        viewInflate.findViewById(2131362726).setOnClickListener(new View.OnClickListener(this) { // from class: idk
            public final /* synthetic */ StorageFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b22 = b2;
                StorageFragment storageFragment = this.b;
                switch (b22) {
                    case 0:
                        r activity = storageFragment.getActivity();
                        Intent intentB = mdb.b(activity);
                        intentB.setAction("com.opera.android.action.SHOW_MANAGE_SPACE");
                        activity.startActivity(intentB);
                        break;
                    default:
                        az0 az0Var = new az0(storageFragment.getContext());
                        az0Var.b(2132021208);
                        az0Var.a(2132021207);
                        az0Var.setPositiveButton(2132021206, new sk(storageFragment, (byte) 12));
                        az0Var.setNegativeButton(2132018111, (DialogInterface.OnClickListener) null);
                        az0Var.c();
                        break;
                }
            }
        });
    }
}
