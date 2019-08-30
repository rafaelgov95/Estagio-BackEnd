/*
 * Copyright (C) 2017 Kleber Kruger
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package br.ufms.estagio.server.resource.enumerate;

/**
 * @author Kleber Kruger
 * @author Rafael Viana
 */
public enum TipoPessoa {

    PESSOA_FISICA, PESSOA_JURIDICA;

    @Override
    public String toString() {
        switch (this) {
            case PESSOA_FISICA:
                return "Pessoa Física";
            case PESSOA_JURIDICA:
                return "Pessoa Jurídica";
        }
        return super.toString();
    }
}
