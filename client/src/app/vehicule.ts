import { Categorie } from "./categorie";

export interface Vehicule {
  id: number;
  immat: string;
  marque: string;
  model: string;
  categorie: Categorie;
}
