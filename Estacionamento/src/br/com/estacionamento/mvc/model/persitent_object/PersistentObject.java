package br.com.estacionamento.mvc.model.persitent_object;

import java.lang.reflect.Field;
import java.util.Objects;

public class PersistentObject {
	@Override
	public String toString() {
		String retorno = "[";
		try {
			Field[] fields = this.getClass().getDeclaredFields();

			for (Field field : fields) {
				retorno += field.getName() + ": " + field.get(this) + ", ";

			}
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return retorno + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(this.getClass().isInstance(obj))) {
			return false;
		}
		try {
			Field[] this_fields = this.getClass().getDeclaredFields();
			Field[] obj_fields = obj.getClass().getDeclaredFields();
			for (int i = 0; i < this_fields.length; i++) {
				if (Objects.equals(this_fields[i].get(this), obj_fields[i].get(obj))) {
					return false;
				}
			}
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
