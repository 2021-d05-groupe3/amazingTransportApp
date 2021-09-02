import { Ressource } from './ressource';
import { Categorie } from "./categorie";

export interface Vehicule extends Ressource{
  id: number;
  immat: string;
  marque: string;
  model: string;
  categorie: Categorie;
}
