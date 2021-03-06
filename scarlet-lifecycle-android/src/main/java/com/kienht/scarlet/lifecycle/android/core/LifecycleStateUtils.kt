/*
 * © 2018 Match Group, LLC.
 */

package com.kienht.scarlet.lifecycle.android.core

import com.tinder.scarlet.LifecycleState

internal fun List<LifecycleState>.combine(): LifecycleState {
    val shouldStop = any { it == LifecycleState.Stopped }
    val completed = any { it == LifecycleState.Completed }

    return when {
        shouldStop -> LifecycleState.Stopped
        completed -> LifecycleState.Completed
        else -> LifecycleState.Started
    }
}
