package com.pos.pioo.web.adapter;

import com.pos.pioo.models.Animal;
import com.pos.pioo.models.AnimalViewModel;

public class AnimalAdapter {
	public static AnimalViewModel ConvertAnimalDspToViewModel(Animal animal) {
		AnimalViewModel viewModel = null;
		if (animal != null) {
			viewModel = new AnimalViewModel();
			viewModel.setId(animal.getId());;
			viewModel.setSubTipo(animal.getSubTipo());
			viewModel.setTipo(animal.getTipo());
			viewModel.setTamanho(animal.getTamanho());
		}
		return viewModel;
	}
}
