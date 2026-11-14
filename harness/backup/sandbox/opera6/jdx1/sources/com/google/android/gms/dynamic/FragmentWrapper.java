package com.google.android.gms.dynamic;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IFragmentWrapper;

@KeepForSdk
@SuppressLint({"NewApi"})
/* loaded from: classes.dex */
public final class FragmentWrapper extends IFragmentWrapper.Stub {
    private final Fragment zza;

    private FragmentWrapper(Fragment fragment) {
        this.zza = fragment;
    }

    @Nullable
    @KeepForSdk
    public static FragmentWrapper wrap(@Nullable Fragment fragment) {
        if (fragment != null) {
            return new FragmentWrapper(fragment);
        }
        return null;
    }

    public final void zzA(@NonNull IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.unwrap(iObjectWrapper);
        Preconditions.checkNotNull(view);
        this.zza.unregisterForContextMenu(view);
    }

    @NonNull
    public final IObjectWrapper zzb() {
        return ObjectWrapper.wrap(this.zza.getActivity());
    }

    @Nullable
    public final Bundle zzc() {
        return this.zza.getArguments();
    }

    public final int zzd() {
        return this.zza.getId();
    }

    @Nullable
    public final IFragmentWrapper zze() {
        return wrap(this.zza.getParentFragment());
    }

    @NonNull
    public final IObjectWrapper zzf() {
        return ObjectWrapper.wrap(this.zza.getResources());
    }

    public final boolean zzg() {
        return this.zza.getRetainInstance();
    }

    @Nullable
    public final String zzh() {
        return this.zza.getTag();
    }

    @Nullable
    public final IFragmentWrapper zzi() {
        return wrap(this.zza.getTargetFragment());
    }

    public final int zzj() {
        return this.zza.getTargetRequestCode();
    }

    public final boolean zzk() {
        return this.zza.getUserVisibleHint();
    }

    @NonNull
    public final IObjectWrapper zzl() {
        return ObjectWrapper.wrap(this.zza.getView());
    }

    public final boolean zzm() {
        return this.zza.isAdded();
    }

    public final boolean zzn() {
        return this.zza.isDetached();
    }

    public final boolean zzo() {
        return this.zza.isHidden();
    }

    public final boolean zzp() {
        return this.zza.isInLayout();
    }

    public final boolean zzq() {
        return this.zza.isRemoving();
    }

    public final boolean zzr() {
        return this.zza.isResumed();
    }

    public final boolean zzs() {
        return this.zza.isVisible();
    }

    public final void zzt(@NonNull IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.unwrap(iObjectWrapper);
        Preconditions.checkNotNull(view);
        this.zza.registerForContextMenu(view);
    }

    public final void zzu(boolean z) {
        this.zza.setHasOptionsMenu(z);
    }

    public final void zzv(boolean z) {
        this.zza.setMenuVisibility(z);
    }

    public final void zzw(boolean z) {
        this.zza.setRetainInstance(z);
    }

    public final void zzx(boolean z) {
        this.zza.setUserVisibleHint(z);
    }

    public final void zzy(@NonNull Intent intent) {
        this.zza.startActivity(intent);
    }

    public final void zzz(@NonNull Intent intent, int i) {
        this.zza.startActivityForResult(intent, i);
    }
}
