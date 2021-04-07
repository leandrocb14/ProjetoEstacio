package com.pos.pioo.web.adapter;

import java.util.ArrayList;
import java.util.List;

import com.pos.pioo.models.Alimentacao;
import com.pos.pioo.models.Animal;
import com.pos.pioo.web.viewmodels.AnimalViewModel;
import com.pos.pioo.web.viewmodels.ListarAnimalViewModel;

public class AnimalAdapter {
	public static AnimalViewModel ConvertAnimalDspToViewModel(Animal animal) {
		AnimalViewModel viewModel = null;
		if (animal != null) {
			viewModel = new AnimalViewModel();
			viewModel.setId(animal.getId());
			viewModel.setSubTipo(animal.getSubTipo());
			viewModel.setTipo(animal.getTipo());
			viewModel.setTamanho(animal.getTamanho());
			if (animal.getAlimentacoes() != null && animal.getAlimentacoes().size() > 0) {
				String concatAlimentacao = null;
				for (Alimentacao alimentacao : animal.getAlimentacoes()) {
					if (alimentacao.getNome() != null && !alimentacao.getNome().isEmpty()) {
						concatAlimentacao += alimentacao.getNome() + ";";
					}
				}
				viewModel.setNomeAlimentacoes(concatAlimentacao);
			}
		}
		return viewModel;
	}

	public static Animal ConvertAnimalViewModelToAnimalDsp(AnimalViewModel viewModel) {
		Animal animal = null;
		if (viewModel != null) {
			animal = new Animal();
			animal.setId(viewModel.getId());
			animal.setSubTipo(viewModel.getSubTipo());
			animal.setTipo(viewModel.getTipo());
			animal.setTamanho(viewModel.getTamanho());
			if (viewModel.getNomeAlimentacoes() != null && !viewModel.getNomeAlimentacoes().isEmpty()) {
				var alimentacoes = viewModel.getNomeAlimentacoes().split(";");
				for (String alimentacao : alimentacoes) {
					if (!alimentacao.isEmpty()) {
						Alimentacao aliment = new Alimentacao();
						aliment.setNome(alimentacao);
						animal.setAlimentacao(aliment);
					}
				}
			}
		}
		return animal;
	}

	public static ListarAnimalViewModel ConvertAnimaisDspToListarAnimalViewModel(List<Animal> animais) {
		ListarAnimalViewModel viewModel = null;
		if (animais != null && animais.size() > 0) {
			viewModel = new ListarAnimalViewModel();
			List<com.pos.pioo.web.viewmodels.Animal> listAnimais = new ArrayList<com.pos.pioo.web.viewmodels.Animal>();
			for (Animal animal : animais) {
				var animalWeb = new com.pos.pioo.web.viewmodels.Animal();
				animalWeb.setId(animal.getId());
				animalWeb.setSubTipo(animal.getSubTipo());
				animalWeb.setTamanho(animal.getTamanho());
				if (animal.getTipoAnimal() != null)
					animalWeb.setTipo(animal.getTipoAnimal().getNome());

				listAnimais.add(animalWeb);
			}
			viewModel.setAnimais(listAnimais);
		}
		return viewModel;
	}
}
