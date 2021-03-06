package de.rki.coronawarnapp.covidcertificate.recovery.ui.details

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import de.rki.coronawarnapp.util.viewmodel.CWAViewModel
import de.rki.coronawarnapp.util.viewmodel.CWAViewModelFactory
import de.rki.coronawarnapp.util.viewmodel.CWAViewModelKey

@Module
abstract class RecoveryCertificateDetailsModule {

    @Binds
    @IntoMap
    @CWAViewModelKey(RecoveryCertificateDetailsViewModel::class)
    abstract fun recoveryCertificateDetailsFragment(
        factory: RecoveryCertificateDetailsViewModel.Factory
    ): CWAViewModelFactory<out CWAViewModel>
}
