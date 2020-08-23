package com.example.scanner.di

import com.example.core.di.general.PerScreen
import com.example.scanner.presentation.presenter.ScannerPresenter
import dagger.Subcomponent

@Subcomponent
@PerScreen
interface ScannerScreenComponent {
    fun scannerPresenter(): ScannerPresenter
}