package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.i;
import com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails;
import com.google.android.material.chip.Chip;
import com.opera.android.OperaApplication;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.android.ui.catalog.widget.OperaTextView;
import com.opera.android.weather.view.WeatherWidgetView;
import com.opera.android.widget.LottieAnimationView;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class x93 extends d {
    public final /* synthetic */ byte a;
    public Object b;

    public /* synthetic */ x93() {
        this.a = (byte) 7;
    }

    public /* synthetic */ x93(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ x93(AbstractList abstractList, byte b) {
        this.a = b;
        this.b = abstractList;
    }

    public x93(sa2 sa2Var, d[] dVarArr) {
        ArrayList arrayList;
        int size;
        this.a = (byte) 1;
        List listAsList = Arrays.asList(dVarArr);
        this.b = new rma(this, sa2Var);
        Iterator it = listAsList.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                super.setHasStableIds(((rma) this.b).b != 1);
                return;
            }
            d dVar = (d) it.next();
            rma rmaVar = (rma) this.b;
            arrayList = (ArrayList) rmaVar.g;
            size = arrayList.size();
            if (size < 0 || size > arrayList.size()) {
                break;
            }
            if (rmaVar.b != 1) {
                jpo.i("All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS", dVar.hasStableIds());
            } else {
                dVar.hasStableIds();
            }
            int size2 = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    i2 = -1;
                    break;
                } else if (((xke) arrayList.get(i2)).c == dVar) {
                    break;
                } else {
                    i2++;
                }
            }
            if ((i2 != -1 ? (xke) arrayList.get(i2) : null) == null) {
                xke xkeVar = new xke(dVar, rmaVar, (b3g) rmaVar.d, ((n2k) rmaVar.i).q());
                arrayList.add(size, xkeVar);
                ArrayList arrayList2 = (ArrayList) rmaVar.f;
                int size3 = arrayList2.size();
                while (i < size3) {
                    Object obj = arrayList2.get(i);
                    i++;
                    RecyclerView recyclerView = (RecyclerView) ((WeakReference) obj).get();
                    if (recyclerView != null) {
                        dVar.onAttachedToRecyclerView(recyclerView);
                    }
                }
                if (xkeVar.e > 0) {
                    ((x93) rmaVar.c).notifyItemRangeInserted(rmaVar.g(xkeVar), xkeVar.e);
                }
                rmaVar.e();
            }
        }
        s49.o("Index must be between 0 and ", arrayList.size(), size, ". Given:");
        throw null;
    }

    public final int G() {
        bmb it = H().iterator();
        int i = 0;
        while (true) {
            bmb bmbVar = it;
            if (!bmbVar.hasNext()) {
                return i;
            }
            dn5 dn5Var = (dn5) bmbVar.next();
            if (dn5Var.e) {
                i |= dn5Var.a;
            }
        }
    }

    public final zlb H() {
        return new zlb(sfe.R((ehc) this.b, dn5.class), new o00((byte) 2), (byte) 0);
    }

    public final void I(eph ephVar) {
        super.setStateRestorationPolicy(ephVar);
    }

    public final void J(ote oteVar, int i) {
        pte pteVar = (pte) this.b;
        Context contextRequireContext = pteVar.requireContext();
        String[] strArr = OperaApplication.K;
        boolean zI = ((OperaApplication) contextRequireContext.getApplicationContext()).J().i("enable_newsfeed");
        cwf cwfVar = (cwf) pteVar.w.get(i);
        oteVar.b.setOnClickListener(oteVar);
        Chip chip = oteVar.b;
        chip.setText(cwfVar.a);
        chip.setSelected(zI && cwfVar.b);
        chip.setHorizontallyScrolling(false);
    }

    public final int findRelativeAdapterPositionIn(d dVar, i iVar, int i) {
        switch (this.a) {
            case 1:
                rma rmaVar = (rma) this.b;
                xke xkeVar = (xke) ((IdentityHashMap) rmaVar.e).get(iVar);
                if (xkeVar == null) {
                    return -1;
                }
                d dVar2 = xkeVar.c;
                int iG = i - rmaVar.g(xkeVar);
                int itemCount = dVar2.getItemCount();
                if (iG >= 0 && iG < itemCount) {
                    return dVar2.findRelativeAdapterPositionIn(dVar, iVar, iG);
                }
                StringBuilder sbO = sko.o(iG, itemCount, "Detected inconsistent adapter updates. The local position of the view holder maps to ", " which is out of bounds for the adapter with size ", ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:");
                sbO.append(iVar);
                sbO.append("adapter:");
                sbO.append(dVar);
                throw new IllegalStateException(sbO.toString());
            default:
                return super.findRelativeAdapterPositionIn(dVar, iVar, i);
        }
    }

    public final int getItemCount() {
        int i = 0;
        switch (this.a) {
            case 0:
                return ((y93) this.b).y.b;
            case 1:
                ArrayList arrayList = (ArrayList) ((rma) this.b).g;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    i += ((xke) obj).e;
                }
                return i;
            case 2:
                return ((ehc) this.b).d();
            case 3:
                return ((pte) this.b).w.size();
            case 4:
                return ((kue) this.b).f.size();
            case 5:
                return ((ArrayList) ((vxi) this.b).e).size();
            case 6:
                return ((ArrayList) this.b).size();
            default:
                return 0;
        }
    }

    public final long getItemId(int i) {
        switch (this.a) {
            case 1:
                rma rmaVar = (rma) this.b;
                z zVarK = rmaVar.k(i);
                xke xkeVar = (xke) zVarK.c;
                long jE = xkeVar.b.e(xkeVar.c.getItemId(zVarK.b));
                zVarK.a = false;
                zVarK.c = null;
                zVarK.b = -1;
                rmaVar.h = zVarK;
                return jE;
            case 2:
                return ((gn5) ((ehc) this.b).get(i)).getId();
            default:
                return super.getItemId(i);
        }
    }

    public final int getItemViewType(int i) {
        int iValueAt;
        switch (this.a) {
            case 1:
                rma rmaVar = (rma) this.b;
                z zVarK = rmaVar.k(i);
                xke xkeVar = (xke) zVarK.c;
                int i2 = zVarK.b;
                w7j w7jVar = xkeVar.a;
                int itemViewType = xkeVar.c.getItemViewType(i2);
                SparseIntArray sparseIntArray = (SparseIntArray) w7jVar.a;
                int iIndexOfKey = sparseIntArray.indexOfKey(itemViewType);
                if (iIndexOfKey > -1) {
                    iValueAt = sparseIntArray.valueAt(iIndexOfKey);
                } else {
                    b3g b3gVar = (b3g) w7jVar.d;
                    xke xkeVar2 = (xke) w7jVar.c;
                    int i3 = b3gVar.b;
                    b3gVar.b = i3 + 1;
                    b3gVar.a.put(i3, xkeVar2);
                    sparseIntArray.put(itemViewType, i3);
                    ((SparseIntArray) w7jVar.b).put(i3, itemViewType);
                    iValueAt = i3;
                }
                zVarK.a = false;
                zVarK.c = null;
                zVarK.b = -1;
                rmaVar.h = zVarK;
                return iValueAt;
            case 2:
                return ((gn5) ((ehc) this.b).get(i)).getType();
            case 3:
            default:
                return super.getItemViewType(i);
            case 4:
                return 0;
        }
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        switch (this.a) {
            case 1:
                rma rmaVar = (rma) this.b;
                ArrayList arrayList = (ArrayList) rmaVar.f;
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    if (((WeakReference) obj).get() == recyclerView) {
                        break;
                    }
                }
                arrayList.add(new WeakReference(recyclerView));
                ArrayList arrayList2 = (ArrayList) rmaVar.g;
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    ((xke) obj2).c.onAttachedToRecyclerView(recyclerView);
                }
                break;
            default:
                super.onAttachedToRecyclerView(recyclerView);
                break;
        }
    }

    public final void onBindViewHolder(i iVar, int i) {
        switch (this.a) {
            case 0:
                t93 t93Var = ((y93) this.b).y;
                ((v93) iVar).b.b.setText(t93Var.d.K0(t93Var.a[i]));
                break;
            case 1:
                rma rmaVar = (rma) this.b;
                z zVarK = rmaVar.k(i);
                ((IdentityHashMap) rmaVar.e).put(iVar, (xke) zVarK.c);
                ((xke) zVarK.c).c.bindViewHolder(iVar, zVarK.b);
                zVarK.a = false;
                zVarK.c = null;
                zVarK.b = -1;
                rmaVar.h = zVarK;
                break;
            case 2:
                ((bn5) iVar).U((gn5) ((ehc) this.b).get(i), i);
                break;
            case 3:
                J((ote) iVar, i);
                break;
            case 4:
                hue hueVar = (hue) iVar;
                kue kueVar = (kue) this.b;
                hueVar.c.setText(((bwf) kueVar.f.get(i)).b());
                hueVar.c.setSelected(i == kueVar.a);
                break;
            case 5:
                uxi uxiVar = (uxi) iVar;
                FidoCredentialDetails fidoCredentialDetails = (FidoCredentialDetails) ((ArrayList) ((vxi) this.b).e).get(i);
                vs vsVar = uxiVar.b;
                TextView textView = (TextView) vsVar.e;
                FrameLayout frameLayout = (FrameLayout) vsVar.b;
                String userName = fidoCredentialDetails.getUserName();
                if (userName == null) {
                    userName = "";
                }
                textView.setText(userName);
                ((TextView) vsVar.c).setText(frameLayout.getContext().getString(2132022382));
                frameLayout.setOnClickListener(new j5g(uxiVar.c, fidoCredentialDetails, (byte) 10));
                break;
            case 6:
                non nonVar = (non) ((ArrayList) this.b).get(i);
                WeatherWidgetView weatherWidgetView = (WeatherWidgetView) ((pon) iVar).b.c;
                Integer numZ = xih.z(nonVar.a);
                vs vsVar2 = weatherWidgetView.a;
                if (numZ == null) {
                    ((LottieAnimationView) vsVar2.d).setImageDrawable((Drawable) null);
                } else {
                    ((LottieAnimationView) vsVar2.d).j(numZ.intValue());
                }
                ((StylingTextView) vsVar2.e).setText(nonVar.a.a);
                break;
            default:
                if (iVar != null) {
                    h9o.t();
                    break;
                }
                break;
        }
    }

    public final i onCreateViewHolder(ViewGroup viewGroup, int i) {
        en5 en5Var;
        byte b = 4;
        int iValueAt = 0;
        xke xkeVar = null;
        switch (this.a) {
            case 0:
                OperaTextView operaTextViewN = j7c.n(viewGroup, 2131559405, viewGroup, false);
                if (operaTextViewN == null) {
                    t3p.q("rootView");
                    break;
                } else {
                    break;
                }
            case 1:
                xke xkeVar2 = (xke) ((b3g) ((rma) this.b).d).a.get(i);
                if (xkeVar2 != null) {
                    xkeVar = xkeVar2;
                } else {
                    qp2.o(sko.i(i, "Cannot find the wrapper for global view type "));
                }
                w7j w7jVar = xkeVar.a;
                SparseIntArray sparseIntArray = (SparseIntArray) w7jVar.b;
                int iIndexOfKey = sparseIntArray.indexOfKey(i);
                if (iIndexOfKey >= 0) {
                    iValueAt = sparseIntArray.valueAt(iIndexOfKey);
                } else {
                    bxl.k(p3p.o(i, "requested global type ", " does not belong to the adapter:"), ((xke) w7jVar.c).c);
                }
                break;
            case 2:
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
                byte b2 = 3;
                if (i == 1) {
                    Object objInflate = layoutInflaterFrom.inflate(2131558613, viewGroup, false);
                    if (objInflate == null) {
                        t3p.q("rootView");
                        break;
                    } else {
                        break;
                    }
                } else {
                    if (i == 2) {
                        Object objInflate2 = layoutInflaterFrom.inflate(2131558616, viewGroup, false);
                        if (objInflate2 == null) {
                            t3p.q("rootView");
                            break;
                        } else {
                            en5Var = new en5(new jt((OperaListItem) objInflate2, b));
                        }
                    } else if (i != 3) {
                        qp2.o(sko.i(i, "Unexpected view type: "));
                        break;
                    } else {
                        Object objInflate3 = layoutInflaterFrom.inflate(2131558615, viewGroup, false);
                        if (objInflate3 == null) {
                            t3p.q("rootView");
                            break;
                        } else {
                            en5Var = new en5(new mn5((StylingTextView) objInflate3, (byte) 0));
                        }
                    }
                    break;
                }
            case 3:
                break;
            case 5:
                break;
            case 6:
                View viewN = j7c.n(viewGroup, 2131559559, viewGroup, false);
                WeatherWidgetView weatherWidgetView = (WeatherWidgetView) w1h.j(2131365098, viewN);
                if (weatherWidgetView == null) {
                    t3p.q("Missing required view with ID: ".concat(viewN.getResources().getResourceName(2131365098)));
                    break;
                } else {
                    break;
                }
        }
        return null;
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        switch (this.a) {
            case 1:
                rma rmaVar = (rma) this.b;
                ArrayList arrayList = (ArrayList) rmaVar.f;
                int size = arrayList.size() - 1;
                while (true) {
                    if (size >= 0) {
                        WeakReference weakReference = (WeakReference) arrayList.get(size);
                        if (weakReference.get() == null) {
                            arrayList.remove(size);
                        } else if (weakReference.get() == recyclerView) {
                            arrayList.remove(size);
                        }
                        size--;
                    }
                }
                ArrayList arrayList2 = (ArrayList) rmaVar.g;
                int size2 = arrayList2.size();
                int i = 0;
                while (i < size2) {
                    Object obj = arrayList2.get(i);
                    i++;
                    ((xke) obj).c.onDetachedFromRecyclerView(recyclerView);
                }
                break;
            default:
                super.onDetachedFromRecyclerView(recyclerView);
                break;
        }
    }

    public final boolean onFailedToRecycleView(i iVar) {
        switch (this.a) {
            case 1:
                rma rmaVar = (rma) this.b;
                IdentityHashMap identityHashMap = (IdentityHashMap) rmaVar.e;
                xke xkeVar = (xke) identityHashMap.get(iVar);
                if (xkeVar == null) {
                    n57.f("Cannot find wrapper for ", iVar, ", seems like it is not bound by this adapter: ", rmaVar);
                    return false;
                }
                boolean zOnFailedToRecycleView = xkeVar.c.onFailedToRecycleView(iVar);
                identityHashMap.remove(iVar);
                return zOnFailedToRecycleView;
            default:
                return super.onFailedToRecycleView(iVar);
        }
    }

    public final void onViewAttachedToWindow(i iVar) {
        switch (this.a) {
            case 1:
                ((rma) this.b).m(iVar).c.onViewAttachedToWindow(iVar);
                break;
            default:
                super.onViewAttachedToWindow(iVar);
                break;
        }
    }

    public final void onViewDetachedFromWindow(i iVar) {
        switch (this.a) {
            case 1:
                ((rma) this.b).m(iVar).c.onViewDetachedFromWindow(iVar);
                break;
            default:
                super.onViewDetachedFromWindow(iVar);
                break;
        }
    }

    public final void onViewRecycled(i iVar) {
        switch (this.a) {
            case 1:
                rma rmaVar = (rma) this.b;
                IdentityHashMap identityHashMap = (IdentityHashMap) rmaVar.e;
                xke xkeVar = (xke) identityHashMap.get(iVar);
                if (xkeVar == null) {
                    n57.f("Cannot find wrapper for ", iVar, ", seems like it is not bound by this adapter: ", rmaVar);
                    break;
                } else {
                    xkeVar.c.onViewRecycled(iVar);
                    identityHashMap.remove(iVar);
                    break;
                }
            case 2:
                ((bn5) iVar).V();
                break;
            default:
                super.onViewRecycled(iVar);
                break;
        }
    }

    public final void setHasStableIds(boolean z) {
        switch (this.a) {
            case 1:
                throw new UnsupportedOperationException("Calling setHasStableIds is not allowed on the ConcatAdapter. Use the Config object passed in the constructor to control this behavior");
            default:
                super.setHasStableIds(z);
                return;
        }
    }

    public final void setStateRestorationPolicy(eph ephVar) {
        switch (this.a) {
            case 1:
                throw new UnsupportedOperationException("Calling setStateRestorationPolicy is not allowed on the ConcatAdapter. This value is inferred from added adapters");
            default:
                super.setStateRestorationPolicy(ephVar);
                return;
        }
    }
}
